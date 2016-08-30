package org.gvaireth.angularintro;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/start")
	public ModelAndView helloWorld(Model model) {
		return new ModelAndView("/View.html");
	}

	@RequestMapping(value = "/getGreetings/{name}")
	public ResponseEntity<Greeting> getGreetings(@PathVariable String name) {
		Greeting greetings = new Greeting("Hello " + name + "!");
		serverTiredAndWillSleepNow();
		return new ResponseEntity<>(greetings, HttpStatus.OK);
	}

	private void serverTiredAndWillSleepNow() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
