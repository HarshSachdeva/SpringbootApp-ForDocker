package com.ibm.saw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.saw.dto.EmpDetails;
import com.ibm.saw.sql.DBUtils;

/**
 * @author HarshSachdeva
 *
 */
@RestController
@RequestMapping("/springbootApp")
public class OptyController {

	Logger logger = LoggerFactory.getLogger(OptyController.class);

	@Autowired
	DBUtils dbUtils;
	
	@GetMapping("/empid/{id}")
	public @ResponseBody EmpDetails getOptyArtifacts(@PathVariable(value = "id") String empid) {
		logger.info("== Entering getOptyArtifacts : partnerid=  empid=" + empid);
		EmpDetails empDetails = null;
		if (empid!=null && !empid.equalsIgnoreCase("") && empid.equalsIgnoreCase("2468")) {
		
		// Get Opportunity details from database
		 empDetails = dbUtils.getOptyDetails(empid);
		
		}
		return empDetails;
	}
	
	private boolean validateHeaderCredentials(String username, String password) {
		logger.info("== Entering gvalidateHeaderCredentials== ");
		boolean isAuthenticated = false;
		if(username != null && password!= null && username.equals("ibm") && password.equals("india")) {
			isAuthenticated = true;
		}
		logger.info("== Entering gvalidateHeaderCredentials== isAuthenticated=="+isAuthenticated);
		return isAuthenticated;
	}

}
