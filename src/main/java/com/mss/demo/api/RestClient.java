package com.mss.demo.api;


	import java.util.Arrays;

	import org.springframework.http.HttpEntity;
	import org.springframework.http.HttpHeaders;
	import org.springframework.http.HttpMethod;
	import org.springframework.http.MediaType;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.client.RestTemplate;

	public class RestClient {
	private static final String FETCH_API = "http://localhost:8080/jpa/getall";

	static RestTemplate restTemplate=new RestTemplate();
	public static void main(String[]args) {
	callFETCHAPI();
	}
	private static void callFETCHAPI() {
	HttpHeaders headers=new HttpHeaders();
	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	HttpEntity<String>entity= new HttpEntity<>("parameters",headers);
	ResponseEntity<String> result= restTemplate.exchange(FETCH_API, HttpMethod.GET, entity,String.class);
	System.out.println(result);
	}
}
