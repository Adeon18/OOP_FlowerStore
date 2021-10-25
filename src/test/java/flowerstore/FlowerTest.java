package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flower.setSepalLength(40);
        flower.setColor(new int[] {127, 0, 0});
//        flower.setColor({127, 0, 0});
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }
    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(40, flower.getSepalLength());
    }
    @org.junit.jupiter.api.Test
    void getColor() {
        assertArrayEquals(new int[] {127, 0, 0}, flower.getColor());
    }
    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @Test
    void testToString() {
        assertEquals("Flower(price=10.0, sepalLength=40.0, color=[127, 0, 0], flowerType=CHAMOMILE)", flower.toString());
    }
}