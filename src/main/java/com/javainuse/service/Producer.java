opackage com.javainuse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic = "pact_topic";
	
	public void send(String data) {
	    
	    kafkaTemplate.send(kafkaTopic, data);
	}
}
