package com.globant.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.globant.api.MarvelApi;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class MarvelApiImpl implements MarvelApi{

	@Autowired
	private RestTemplate restTemplate;
	
		
	
	@Override
	public <T extends Class> ResponseEntity<?> call(T responseType, String url, HttpMethod method, HttpEntity<?> entity) {
	
		log.info("Call api with url {}", (url));		
		return restTemplate.exchange(url, method, entity, responseType);
	}

}
