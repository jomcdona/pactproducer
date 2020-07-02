package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.service.Producer;

@RestController
@RequestMapping(value = "/pact/")
public class ApacheKafkaWebController {

	@Autowired
	Producer kafkaSender;

	@PostMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);

		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}

}

