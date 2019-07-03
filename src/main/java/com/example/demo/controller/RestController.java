package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

//	@RequestMapping(value="/webhook/trigger", method=RequestMethod.POST)
	@PostMapping("/webhook/trigger")
	public String show(@RequestBody Map<String,String> body) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return "thainn2";
	}
}
