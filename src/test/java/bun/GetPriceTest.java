package bun;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import recources.constants.Constants;

import java.util.Random;

public class GetPriceTest {

    private Random random = new Random();
    private final float bunPrice = random.nextFloat();
    Constants constants = new Constants();

    @Test
    public void getPriceReturnsBunPrice() {
        Bun bun = new Bun("Булочка", bunPrice);
        float actual = bun.getPrice();
        Assert.assertEquals(bunPrice, actual, constants.getDELTA());
    }
}
