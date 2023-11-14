package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaController {

	@GetMapping("/nick")
	public Teacher getInfo() {

		return new Teacher("milmilya", "taklya");
	}

	@GetMapping("/teach")
	public List<Teacher> getTea() {
		List<Teacher> t = new ArrayList<Teacher>();

		t.add(new Teacher("kuthe", "strict"));

		t.add(new Teacher("kapilsir", "marathi"));

		t.add(new Teacher("bharti", "hot"));

		t.add(new Teacher("adkine", "history"));

		return t;
	}

	@GetMapping("/teacher/{fname}/{lname}")
	public Teacher getDetail(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {

		return new Teacher(fname, lname);
	}

	// quary
	@GetMapping("/teachers")
	public Teacher getReq( @RequestParam(name = "fnames") String fnames, 
							@RequestParam(name = "lnames") String lnames) {

		return new Teacher(fnames, lnames);
	}

}
