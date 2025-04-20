package com.example.application.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {

	public Map<String, Integer> getGenderMap(){
		return new LinkedHashMap<String, Integer>() {
			
			{
				put("男性", 1);
				put("女性", 2);
			}
			
		};
	}
	
	
}
