package com.service.payment.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Payment implements Serializable {
    private Long id;
    private Long userId;
    private Long productId;
    private String creditCardNumber;
}
