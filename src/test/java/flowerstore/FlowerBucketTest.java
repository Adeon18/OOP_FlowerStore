package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerPack pack;
    private FlowerBucket bucket;
    private Flower flower;
    // List to test the flower bucket
    private List<FlowerPack> to_test;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP);
        pack = new FlowerPack();
        bucket = new FlowerBucket();
        flower.setPrice(10);
        pack.setFlower(flower);
        pack.setAmount(2);
        // The testing list
        to_test = new ArrayList<FlowerPack>();
        to_test.add(pack);
    }

    @Test
    void addFlowerPack() {
        bucket.addFlowerPack(pack);
        assertArrayEquals(to_test.toArray(), bucket.getFlowerPacks().toArray());
    }

    @Test
    void getPrice() {
        bucket.addFlowerPack(pack);
        assertEquals(20, bucket.getPrice());
    }
}