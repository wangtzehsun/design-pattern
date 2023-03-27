package com.example.pattern.factory.exercise02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {

    @Autowired
    PaymentServiceFactory factory;

    @PostMapping("type")
    public String payMethod(@RequestBody PaymentRequest request){
        String paymentType = request.getPaymentMethod();
        String pay = null;
        try {
            pay = factory.getService(paymentType).pay(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pay;
    }

}
