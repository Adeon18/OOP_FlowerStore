package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    double price;
    CreditCardPaymentStrategy strategy;

    @BeforeEach
    void setUp() {
        price = 10;
        strategy = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("Enter your Credit Card info: ", strategy.pay(price));
    }
}