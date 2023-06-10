package com.platzi.javatestmockito.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before//Sirve para decirle a JUnit que ejecute este metodo antes de cada test
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }


    @Test
    public void payment_is_correct() {
        //Preparacion de los objetos
         Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        //Ejecucion del metodo
        boolean result = paymentProcessor.makePayment(1000);
        //comprobacion del resultado
        assertTrue(result);

    }

    @Test
    public void payment_is_wrong() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));


        assertFalse(paymentProcessor.makePayment(1000));

    }
}