package com.nextlevel.example.angularjs15;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	@RequestMapping("/resource")
	public Map<String, Object> home() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// do nothing
		}
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World!!!");
		return model;
	}

}
