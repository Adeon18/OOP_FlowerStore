package order;

import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Item bucket = new FlowerBucket();
    Item flower = new Flower(FlowerType.ROSE);
    FlowerPack pack = new FlowerPack();
    Order order;

    @BeforeEach
    void setUp() {
        // Set up the tests for order.
        bucket = new FlowerBucket();
        flower = new Flower(FlowerType.ROSE);
        pack = new FlowerPack();
        order = new Order();
        // Change some data
        ((Flower) flower).setPrice(10);
        FlowerPack pack = new FlowerPack();
        pack.setFlower((Flower) flower);
        pack.setAmount(5);
        ((FlowerBucket) bucket).addFlowerPack(pack);
        // Initialise a bucket to an order
        bucket = new RibbonDecorator(bucket);
        order.addItem(bucket);

    }

    @Test
    void calculateTotalPrice() {
        assertEquals(90, order.calculateTotalPrice());
    }

    @Test
    void processOrder() {
        assertEquals("Your Order is being processed.", order.processOrder());
    }
}