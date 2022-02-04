package se.digitalent.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/ping")
	public Greeting ping(){
		return new Greeting("ping", "pong");
	}

	@GetMapping("/hellojenkins")
	public Greeting hellojenkins(){
		return new Greeting("hello", "jenkins");
	}
}
