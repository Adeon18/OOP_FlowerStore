package decorators;

import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    Item bucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        bucket = new RibbonDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(40, bucket.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("This is a RibbonDecorator", bucket.getDescription());
    }
}