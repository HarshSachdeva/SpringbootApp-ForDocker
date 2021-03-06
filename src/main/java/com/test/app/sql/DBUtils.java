package com.test.app.sql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.app.OptyController;
import com.test.app.dto.EmpDetails;

@org.springframework.stereotype.Component
public class DBUtils {

	Logger logger = LoggerFactory.getLogger(OptyController.class);

	public EmpDetails getOptyDetails(String empId) {
		logger.info("==Entering getOptyDetails : get opportunity details from database for OptyId=" + empId);

		EmpDetails empDetails = new EmpDetails();
		empDetails.setEmpId(2468);
		empDetails.setEmpName("Happy Harsh");
		empDetails.setEmpLocation("Gurugram");
		empDetails.setEmpDept("ABS");  
		
		return empDetails;
	}
}
