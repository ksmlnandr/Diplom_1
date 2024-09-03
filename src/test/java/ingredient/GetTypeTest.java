package ingredient;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class GetTypeTest {

    private final IngredientType ingredientType;
    private final IngredientType expected;

    public GetTypeTest(IngredientType ingredientType, IngredientType expected) {
        this.ingredientType = ingredientType;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setParameters() {
        return new Object[][] {
                {SAUCE, SAUCE},
                {FILLING, FILLING}
        };
    }

    @Test
    public void getTypeReturnsIngredientType() {
        Ingredient ingredient = new Ingredient(ingredientType, "Что-то вкусненькое", 12);
        IngredientType actual = ingredient.getType();
        Assert.assertEquals(expected, actual);
    }
}
