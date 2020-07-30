
import java.util.*;
import java.security.*;
import java.io.Console;
import java.sql.*;

public class PasswordManager {
	public static Connection connection;
	
	public static int add(String username, String password, int role, String question, String answer) throws Exception, SQLException {
		int salt = chooseNewSalt();
		String hpwd = getSaltedHash(password, salt);
                
		String psInsertQuery = 
			"INSERT INTO users (username, hpwd, salt, question, answer, role) " +
			"VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = connection.prepareStatement(psInsertQuery);
                
		ps.setString(1, username);
		ps.setString(2, hpwd);
		ps.setInt(3, salt);
		ps.setString(4, question);
		ps.setString(5, answer);
    	ps.setInt(6, role);
		ps.executeUpdate();
                
		String psQuery = 
				"SELECT userid FROM users WHERE username = ?";
		
		ps = connection.prepareStatement(psQuery);
		
		ps.setString(1, username);
		
		ResultSet userID = ps.executeQuery();
		
		userID.next();
		
		return userID.getInt(1);
	}
	
	// for driving
	public static void delete(String username) throws SQLException {
		String psDeleteQuery = 
			"DELETE FROM users " + 
			"WHERE username = ?";
			
		PreparedStatement ps = connection.prepareStatement(psDeleteQuery);
		ps.setString(1, username);
		
		ps.executeUpdate();
	}
	
	public static int updatePassword(int userid, String password) throws Exception, SQLException {
		int salt = chooseNewSalt();
		String hpwd = getSaltedHash(password, salt);
		
		String psUpdateQuery =
			"UPDATE users SET " +
			"hpwd = ?, " +
			"salt = ? " +
			"WHERE userid = ?";
			
		PreparedStatement ps = connection.prepareStatement(psUpdateQuery);
		
		ps.setString(1, hpwd);
		ps.setInt(2, salt);
		ps.setInt(3, userid);
		
		return ps.executeUpdate();
	}

	public static int chooseNewSalt() throws NoSuchAlgorithmException {
		return getSecureRandom();
	}

	private static int getSecureRandom() throws NoSuchAlgorithmException {
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		return Math.abs(sr.nextInt());
	}

	public static String getSaltedHash(String password, int salt) throws Exception {
		return computeSHA(password + "|" + salt);
	}

	private static String computeSHA(String preimage) throws Exception {
		MessageDigest md = null;
		md = MessageDigest.getInstance("SHA-256");
		md.update(preimage.getBytes("UTF-8"));
		byte raw[] = md.digest();
		return (java.util.Base64.getEncoder().encodeToString(raw));
	}
	
	private static HashedPasswordTuple queryPassword(String username) throws SQLException {
		String psQuery = 
			"SELECT hpwd, salt " + 
			"FROM users WHERE username = ?";
		
		PreparedStatement ps = connection.prepareStatement(psQuery);
		ps.setString(1, username);
		
		ResultSet user = ps.executeQuery();
		
		if (user.next()) {
			return new HashedPasswordTuple(user.getString(1), user.getInt(2));
		}
		else {
			return null;
		}
	}
	
	public static boolean checkPassword(String username, String password) {
		try {
			HashedPasswordTuple t = queryPassword(username);
			return t == null ? false : 
				t.getHashedPassword().equals(getSaltedHash(password, t.getSalt()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		return false;
	}

	public static boolean initDB(String username, String password) {
            try {
                    String dbURL = "jdbc:mysql://localhost:3306/accounts";
                    connection = DriverManager.getConnection(
                            dbURL, username, password
                    );

                    password = null;

                    if (connection != null) {
                            return true;
                    }
            } catch (SQLException e) {
                    for (Throwable t : e) {
                            System.err.println(e.getMessage());
                    }
            }
            
            return false;
	}
        
    public static void main(String argv[]) {
                Console console = System.console();
		if (console == null) {
			System.out.println("Failed to retrieve console instance.");
			System.exit(0);
		}
                
                String username = console.readLine("Username: ");
		String password = new String(console.readPassword("Password: "));
            
		if (!initDB(username, password)) {
                    System.err.println("Failed to connect to DB");
                    System.exit(1);
                }
                
                username = null;
                password = null;
		
		console = System.console();
		System.out.println(
			"PLEASE LOG INTO MySQL SERVER TO SEE CHANGES\n\n" + 
			"\nCommands:\n" + 
			"1:\tEnter new user\n" + 
			"2:\tDelete existing user\n" + 
			"3:\tLog in\n\n" + 
			"q:\tQuit\n"
		);
		
		String input = console.readLine();
		while (!input.equals("q")) {
			if (input.equals("1")) {
				System.out.println("==Adding User==");
			
				username = console.readLine("Username: ");
				password = new String(console.readPassword("Password: "));
                                int role = Integer.parseInt(console.readLine("Role: "));
				
				try {
					add(username, password, role, "", "");
				} catch (Exception e) {
					System.out.println(e.getMessage());
                                        System.out.println("unsuccessful...");
				}
				
				password = null;
			}
			else if (input.equals("2")) {
				System.out.println("==Removing User==");
				
				username = console.readLine("Username: ");
				
				try {
					delete(username);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
			else if (input.equals("3")) {
				System.out.println("==Log In==");
				
				username = console.readLine("Username: ");
				password = new String(console.readPassword("Password: "));
				
				boolean loggedIn = checkPassword(username, password);
				password = null;
				
				if (loggedIn) {
					System.out.println(username + " successfully logged in.");
				}
				else {
					System.out.println("Username or password is incorrect.");
				}
			}
			
			System.out.println("\nAwaiting next command...");
			input = console.readLine();
		}
	}
}

class HashedPasswordTuple {
	private String hpwd;
	private int salt;
	
	public HashedPasswordTuple(String hpwd, int salt) {
		this.hpwd = hpwd;
		this.salt = salt;
	}
	
	public String getHashedPassword() {
		return hpwd;
	}
	
	public int getSalt() {
		return salt;
	}
	
	public String toString() {
		return hpwd + ":" + salt;
	}
}