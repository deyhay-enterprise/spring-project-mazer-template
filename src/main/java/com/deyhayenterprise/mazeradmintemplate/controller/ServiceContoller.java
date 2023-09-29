package com.deyhayenterprise.mazeradmintemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ServiceContoller {

    @GetMapping("/greetingNoParamTest")
	public String greetingNoParamTest() {

		log.info("greeting..");
		String returnValue = "OK";

		return returnValue;
	}
	    
}
