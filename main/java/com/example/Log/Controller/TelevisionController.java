package com.example.Log.Controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Log.TelevisionRepo;
import com.example.Log.Entity.Television;

@RestController
public class TelevisionController {
	@Autowired
	TelevisionRepo tr;
	static Logger log=Logger.getLogger(TelevisionController.class);
	@PostMapping(value="/add")
	public Television add(@RequestBody Television t) {
		PropertyConfigurator.configure("log4j.properties");
		log.warn(tr.save(t));
		return tr.save(t);
	}

}
