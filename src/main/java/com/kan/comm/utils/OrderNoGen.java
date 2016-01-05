package com.kan.comm.utils;

import org.springframework.stereotype.Service;

import javax.ws.rs.ext.ParamConverter.Lazy;
import java.security.SecureRandom;
import java.util.UUID;

@Service
@Lazy
public abstract class OrderNoGen {
	
	@SuppressWarnings("unused")
	private static SecureRandom random = new SecureRandom();
	
	public static String getOrder(Short orderType){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
