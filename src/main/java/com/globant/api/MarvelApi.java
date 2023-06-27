package com.globant.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public interface MarvelApi {

	
	public <T extends Class> ResponseEntity<?> call(T responseType, String url, HttpMethod method, HttpEntity<?> entity);
}
