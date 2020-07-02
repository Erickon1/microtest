package mx.erma.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Value("${service.instance.name}")
	private String instance;
	
	@GetMapping
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>(
				"Hello everyone from: "+instance,HttpStatus.OK);
	}
}
