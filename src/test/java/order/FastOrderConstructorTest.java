package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest {

    Order order;

    @BeforeEach
    void setUp() {
        order = FastOrderConstructor.createOrder(FastOrderConstructor.ROSE_BUCKET);
    }

    @Test
    void createOrder() {
        // These are all the tests, couldn't think of more
        // Rose
        assertEquals(100, order.calculateTotalPrice());
        assertEquals("Your Order is being processed.", order.processOrder());

        order = FastOrderConstructor.createOrder(FastOrderConstructor.TULIP_BUCKET);
        // Tulip
        assertEquals(50, order.calculateTotalPrice());
        assertEquals("Your Order is being processed.", order.processOrder());

        order = FastOrderConstructor.createOrder(FastOrderConstructor.CHAMOMILE_BUCKET);
        // Chamomile
        assertEquals(200, order.calculateTotalPrice());
        assertEquals("Your Order is being processed.", order.processOrder());
    }
}