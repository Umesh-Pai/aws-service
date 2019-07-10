package com.tachyon.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umesh.pai on 01/16/2018.
 */

@RestController
public class AWSController {

	@RequestMapping(value = "/v1/aws", method = RequestMethod.GET)
	public String getAWS()
	{
		return "Hello from EC2 AWS-Redeploy";
	}
}
