package template.printer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PrinterListener {

	@KafkaListener(topics ="active-print")
	public void listenForPrint(String message) {
		System.out.println("Kafka recive message");
	}
}
