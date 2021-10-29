package decorators;

import flowerstore.FlowerBucket;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    Item bucket = new FlowerBucket();

    @BeforeEach
    void setUp() {
        bucket = new PaperDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(13, bucket.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("This is a PaperDecorator", bucket.getDescription());
    }
}