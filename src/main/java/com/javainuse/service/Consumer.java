import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;
import java.io.IOException;

@Service
public class Consumer {


    @KafkaListener(topics = "pact_topic")
    public void consume(String message) throws IOException {
        System.out.println("Consumed message " +  message);
    }
}
