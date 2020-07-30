/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ostovargas
 */
public class User {
    private int userID;
    private int employeeID;
    private String username;
    private int role;
    
    public User(int userID, int employeeID, String username, int role) {
        this.userID = userID;
        this.employeeID = employeeID;
        this.username = username;
        this.role = role;
    }
    
    public int getUserID() {
        return userID;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public String getUserName() {
        return username;
    }
    
    public int getRole() {
        return role;
    }
}
