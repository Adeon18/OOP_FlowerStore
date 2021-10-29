package decorators;

import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    Item bucket = new FlowerBucket();

    @Test
    void getPrice() {
        assertEquals(4, bucket.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("This is a BasketDecorator", bucket.getDescription());
    }

    @BeforeEach
    void setUp() {
        bucket = new BasketDecorator(bucket);
    }
}