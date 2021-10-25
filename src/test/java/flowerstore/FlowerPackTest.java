package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack pack;
    private Flower flower;
    @BeforeEach
    void setUp() {
        pack = new FlowerPack();
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        pack.setFlower(flower);
        pack.setAmount(666);
    }

    @Test
    void getPrice() {
        assertEquals(6660, pack.getPrice());
    }
}