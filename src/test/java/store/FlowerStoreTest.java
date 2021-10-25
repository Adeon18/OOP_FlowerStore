package store;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlowerStoreTest {

    ArrayList<Flower> test_arr = new ArrayList<Flower>();
    private FlowerStore store;
    private Flower flower;
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;
    private Flower flower4;


    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flower.setSepalLength(10);
        flower.setColor(new int[]{127, 0, 0});
        flower1 = new Flower(FlowerType.ROSE);
        flower1.setPrice(10);
        flower1.setSepalLength(10);
        flower1.setColor(new int[]{127, 0, 0});
        flower2 = new Flower(FlowerType.CHAMOMILE);
        flower2.setPrice(20);
        flower2.setSepalLength(10);
        flower2.setColor(new int[]{127, 127, 0});
        flower3 = new Flower(FlowerType.TULIP);
        flower3.setPrice(30);
        flower3.setSepalLength(10);
        flower3.setColor(new int[]{127, 0, 0});
        flower4 = new Flower(FlowerType.TULIP);
        flower4.setPrice(20);
        flower4.setSepalLength(10);
        flower4.setColor(new int[]{127, 0, 0});
        // Add flowers to list
        test_arr.add(flower);
        test_arr.add(flower1);
        test_arr.add(flower2);
        test_arr.add(flower3);
        test_arr.add(flower4);
        // Init store
        store = new FlowerStore();

    }

    @Test
    void search() {
        // Test Price
        PriceFilterSpecification price_filter = new PriceFilterSpecification(10);
        ArrayList<Flower> filtered_price = store.Search(test_arr, price_filter);
        assertArrayEquals(filtered_price.toArray(), new Flower[]{flower, flower1});
        // Test Sepal len
        SepalLengthFilterSpecification sepal_filter = new SepalLengthFilterSpecification(10);
        ArrayList<Flower> filtered_sepal = store.Search(test_arr, sepal_filter);
        assertArrayEquals(filtered_sepal.toArray(), new Flower[]{flower, flower1, flower2, flower3, flower4});
        // Test Color
        ColorFilterSpecification color_filter = new ColorFilterSpecification(new int[]{127, 0, 0});
        ArrayList<Flower> filtered_color = store.Search(test_arr, color_filter);
        assertArrayEquals(filtered_color.toArray(), new Flower[]{flower, flower1, flower3, flower4});
        // Test Sepal len
        FlowerTypeFilterSpecifiction ftype_filter = new FlowerTypeFilterSpecifiction(FlowerType.ROSE);
        ArrayList<Flower> filtered_ftype = store.Search(test_arr, ftype_filter);
        assertArrayEquals(filtered_ftype.toArray(), new Flower[]{flower, flower1});
    }
}