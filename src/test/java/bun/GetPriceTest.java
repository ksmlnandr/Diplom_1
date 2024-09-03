package bun;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

import java.util.Random;

public class GetPriceTest {

    private Random random = new Random();
    private float bunPrice = random.nextFloat();
    private Bun bun = new Bun("Булочка", bunPrice);

    @Test
    public void getPriceReturnsBunPrice() {
        bun.getPrice();
        Assert.assertEquals(bunPrice, bun.getPrice(),0);
    }
}
