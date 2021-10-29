package delivery;

import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    PostDeliveryStrategy del_strategy;
    List<Item> itel_l = new LinkedList<>();

    @BeforeEach
    void setUp() {
        del_strategy = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals("The Items should be delivered by Post.", del_strategy.deliver(itel_l));
    }
}