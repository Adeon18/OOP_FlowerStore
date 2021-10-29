package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    double price;
    PayPalPaymentStrategy strategy;

    @BeforeEach
    void setUp() {
        price = 10;
        strategy = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("Please enter your Pay Pal info: ", strategy.pay(price));
    }
}