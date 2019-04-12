package com.javaplayschool.SpringCloudConfigClientTwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${welcome.message}")
	public String welcomeMsg;
	
	@Value("${db.userName}")
	public String dbUserName;
	
	@Value("${db.password}")
	public String dbPassword;
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		System.out.println(welcomeMsg);
		
		return welcomeMsg;
	}
	
	@RequestMapping("/dbdetails")
	public String getDBDetails() {
		
		String dbDetails = "User Name : "+dbUserName+"<br/> Password : "+dbPassword;
		
		System.out.println(dbDetails);
		
		return dbDetails;
	}

}
