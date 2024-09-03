package bun;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

import java.util.Random;

public class GetPriceTest {

    private Random random = new Random();
    private final float bunPrice = random.nextFloat();

    @Test
    public void getPriceReturnsBunPrice() {
        Bun bun = new Bun("Булочка", bunPrice);
        float actual = bun.getPrice();
        Assert.assertEquals(bunPrice, actual,0.0);
    }
}
