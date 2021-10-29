import decorators.BasketDecorator;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import flowerstore.*;
import order.Order;

public class Main {
    public static void main(String[] args) {
        Item bucket = new FlowerBucket();
        Item flower = new Flower(FlowerType.ROSE);
        ((Flower) flower).setPrice(10);
        FlowerPack pack = new FlowerPack();
        pack.setFlower((Flower) flower);
        pack.setAmount(5);
        ((FlowerBucket) bucket).addFlowerPack(pack);
        flower = new PaperDecorator(flower);
        bucket = new RibbonDecorator(bucket);
        Order order = new Order();
        order.addItem(bucket);
        System.out.println(order.calculateTotalPrice());
        Order order1 = new Order();
        order1.addItem(flower);
        System.out.println(order1.calculateTotalPrice());
    }
}
