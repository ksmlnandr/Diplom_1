package bun;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class GetNameTest {

    private Bun bun = new Bun("Булочка", 12);

    @Test
    public void getNameReturnsBunName(){
        bun.getName();
        Assert.assertEquals("Булочка", bun.getName());
    }
}
