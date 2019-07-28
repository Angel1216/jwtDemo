package es.softtek.jwtDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("hello")
	public ResponseEntity<Object> helloWorld(@RequestHeader(value="authorization", required = true) String authorization, @RequestParam(value="name", defaultValue="World") String name) {
		
		return new ResponseEntity<Object>("Hello "+name+"!!", HttpStatus.OK);
	}
}
