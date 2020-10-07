package com.tc.ActionEvents;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class SerilizeDeserilize {

	private static ObjectMapper mapper;
	
	static{
		mapper=new ObjectMapper();
	}
	
	public static String convertJavaToJson(Object object){
		String JsonResponse = "";
		try {
			JsonResponse = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Problem Converting into Json "+e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Problem Converting into Json "+e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem Converting into Json "+e.getMessage());
		}
		return JsonResponse;
	}
}
