package com.db.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest")
public class HelloController {

	@Value("${message: This is default message!}")
	private String msg;

	@GetMapping("/hello")
	public String hello() {
		return msg;
	}
}
