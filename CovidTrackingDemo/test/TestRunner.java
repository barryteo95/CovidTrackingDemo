/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import covidtrackingdemo.Controller.HealthOrganization.LoginControllerTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author User
 */
public class TestRunner {
    
    public static void main(String[] args) {
        
        Result result = JUnitCore.runClasses(LoginControllerTest.class);
		
	System.out.println("Is the test successful?: " + result.wasSuccessful());
		
	for (Failure failure : result.getFailures()) {
            System.out.println("Failure: " + failure.toString());
	}
    }
}
