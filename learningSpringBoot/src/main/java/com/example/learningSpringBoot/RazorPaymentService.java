package com.example.learningSpringBoot;

import org.springframework.stereotype.Component;

//beam: it is used by component annotation jaha component annotation milti hai waha scan krta hai
// and osski beam bna deeta hai..
@Component
public class RazorPaymentService implements PaymentService {

    @Override
    public String pay() {
        String payment = "Razorpay Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
