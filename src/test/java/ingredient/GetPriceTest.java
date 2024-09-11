package ingredient;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Random;

public class GetPriceTest {

    private Random random = new Random();
    private final float ingredientPrice = random.nextFloat();

    @Test
    public void getPriceReturnsIngredientPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "Что-то вкусненькое", ingredientPrice);
        float actual = ingredient.getPrice();
        Assert.assertEquals(ingredientPrice, actual, 0.0F);
    }

}
