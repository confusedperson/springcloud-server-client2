package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FaceCustomer;
import com.example.demo.service.FaceService;

@RestController
@RequestMapping("/face")
public class FaceController {
	@Autowired 
	private FaceService faceService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String getString(String id) {
		String string = faceService.test();
		return faceService.test();
	}
}
