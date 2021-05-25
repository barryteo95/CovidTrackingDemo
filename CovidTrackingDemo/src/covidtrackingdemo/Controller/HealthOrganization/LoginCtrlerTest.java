/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class LoginCtrlerTest {
    
    private LoginCtrler instance;
    
    public LoginCtrlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        this.instance = new LoginCtrler();
    }
    
    @After
    public void tearDown() {
        
        instance = null;
    }

    /**
     * Test of login method, of class LoginController.
     */
    @Test
    public void testLogin() throws Exception {
               
        String username;
        String password;
        String expResult;
        String result;
               
        // Valid Admin account
        username = "admin1";
        password = "admin";
        expResult = "Admin";
        result = instance.login(username, password);
        assertEquals(expResult, result, "Admin account should work.");
        
        // Valid Public User account
        username = "LD1@example.com";
        password = "password";
        expResult = "Public User";
        result = instance.login(username, password);
        assertEquals(expResult, result, "Public User account should work.");
        
        // Valid Business Owner account
        username = "AM1001@example.com";
        password = "password";
        expResult = "Business Owner";
        result = instance.login(username, password);
        assertEquals(expResult, result, "Business Owner account should work.");
        
        // Valid Health Staff account
        username = "AD1026@example.com";
        password = "password";
        expResult = "Health Staff";
        result = instance.login(username, password);
        assertEquals(expResult, result, "Health Staff account should work.");
        
        // Incorrect example
        username = "@example.com";
        password = "password";
        expResult = "";
        result = instance.login(username, password);
        assertEquals(expResult, result, "Invalid account should work.");
    }
}
