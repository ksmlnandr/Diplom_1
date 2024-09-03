package ingredient;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class GetNameTest {

    private final String name = "Что-то вкусненькое";

    @Test
    public void getNameReturnsIngredientName() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, name, 12);
        String actual = ingredient.getName();
        Assert.assertEquals(name, actual);
    }
}
