package bun;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class GetNameTest {

    private final String name = "Булочка";

    @Test
    public void getNameReturnsBunName(){
        Bun bun = new Bun(name, 12);
        String actual = bun.getName();
        Assert.assertEquals(name, actual);
    }
}
