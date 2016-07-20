package com.nextlevel.example.angularjs15;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	private static Principal PRINCIPAL;

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

	@RequestMapping("/user")
	public Principal user(@RequestHeader(value = "Authorization", defaultValue = "") String auth) {
		if (PRINCIPAL != null) {
			System.out.println("already logged in");
			return PRINCIPAL;
		}

		if (StringUtils.isEmpty(auth)) {
			System.out.println("authentication required");
			return null;
		} else {
			PRINCIPAL = new Principal() {

				@Override
				public String getName() {
					return auth;
				}
			};
			System.out.println("logged in");
			return PRINCIPAL;
		}
	}


	@RequestMapping("/logout")
	public void logout() {
		System.out.println("logged out");
		PRINCIPAL = null;
	}

}
