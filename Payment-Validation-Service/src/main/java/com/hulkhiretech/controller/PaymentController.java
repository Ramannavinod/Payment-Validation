package com.hulkhiretech.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hulkhiretech.pojo.CreatePaymentReq;

import jakarta.validation.Valid;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v2/payment")
@Slf4j
public class PaymentController {
	
     @PostMapping
     public CreatePaymentReq createPayment(@Valid @RequestBody CreatePaymentReq createPaymentReq) {
    	 log.info("CreatePaymentRequest:"+createPaymentReq);
		 return createPaymentReq;
	 }

}
