package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.FaceCustomerMapper;
import com.example.demo.model.FaceCustomer;
import com.example.demo.service.FaceService;
import com.example.demo.utils.JsonResult;

@Service
@Transactional
public class FaceServiceImpl implements FaceService{
	@Autowired
	private FaceCustomerMapper faceCustomerMapper;
	
	@Override
	@Transactional(readOnly = true)
	public String test() {
		FaceCustomer faceCustomer = faceCustomerMapper.selectByPrimaryKey(62415400);
		System.out.println("asdaasaa");
		return JsonResult.success(faceCustomer);
	}
}
