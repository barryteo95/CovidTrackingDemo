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
        
        System.out.println("LoginControllerTest - testLogin()");
       
        String username;
        String password;
        String expResult;
        String result;
                
        username = "admin1";
        password = "admin";
        expResult = "Admin";
        result = instance.login(username, password);
        assertEquals(expResult, result);
        
        username = "EC1@example.com";
        password = "password";
        expResult = "Public User";
        result = instance.login(username, password);
        assertEquals(expResult, result);
        
        username = "LW499@example.com";
        password = "password";
        expResult = "Business Owner";
        result = instance.login(username, password);
        assertEquals(expResult, result);
        
        username = "OW895@example.com";
        password = "password";
        expResult = "Health Staff";
        result = instance.login(username, password);
        assertEquals(expResult, result);
        
        username = "Testing@example.com";
        password = "password";
        expResult = "";
        result = instance.login(username, password);
        assertEquals(expResult, result);
    
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
