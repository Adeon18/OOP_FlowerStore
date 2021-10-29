package delivery;

import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    DHLDeliveryStrategy del_strategy;
    List<Item> itel_l = new LinkedList<>();

    @BeforeEach
    void setUp() {
        del_strategy = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals("The ite should be delivered by DHL", del_strategy.deliver(itel_l));
    }
}