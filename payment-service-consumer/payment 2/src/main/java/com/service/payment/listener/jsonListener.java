package com.service.payment.listener;

import lombok.extern.log4j.Log4j2;
import com.service.payment.model.Payment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class jsonListener {

    @KafkaListener(topics = "payment-topic", groupId = "group-id", containerFactory = "jsonContainerConsumer")
    public void JsonConsumer(Payment payment) {
        log.info("recebido o pagamento{}", payment.toString());
    }
}
