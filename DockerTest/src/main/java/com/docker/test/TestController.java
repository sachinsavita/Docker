package com.docker.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/")
	public Map<String, Object> getValues()
	{
		Map<String, Object> data = new HashMap<>();
		data.put("message", "Java API working fine!!!");
		data.put("languages", Arrays.asList("Java","Python","JavaScript"));
		data.put("Code", 2345);
		return data;
	}

}
