package com.skious.springtuto.serviceimpl;

import java.util.Random;

import com.skious.springtuto.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, "+ companyName +
				" provides an outstanding Ecommerce platform." +
				"\nThe annual revenue exceeds "+ random.nextInt(revenue) + " dollars.";
		return service;
	}

}
