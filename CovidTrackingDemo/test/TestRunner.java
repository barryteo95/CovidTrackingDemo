
import covidtrackingdemo.Controller.HealthOrganization.LoginCtrlerTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestRunner {
    
    public static void main(String[] args) {
        
        // Return the results from running the test in LoginCtrlerTest class
        Result result = JUnitCore.runClasses(LoginCtrlerTest.class);
		
	System.out.println("Is the test successful?: " + result.wasSuccessful());
	
	for (Failure failure : result.getFailures()) {
            System.out.println("Failure: " + failure.toString());
	}
    }
}
