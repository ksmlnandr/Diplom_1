package bun;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class GetNameTest {

    private String name = "Булочка"
    private Bun bun = new Bun(name, 12);

    @Test
    public void getNameReturnsBunName(){
        String actual = bun.getName();
        Assert.assertEquals(name, actual);
    }
}
