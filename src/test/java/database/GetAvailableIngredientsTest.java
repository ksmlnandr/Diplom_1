package database;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

@RunWith(Parameterized.class)
public class GetAvailableIngredientsTest {
    private Database database = new Database();

    private final int arrayCount;
    private final IngredientType expectedType;
    private final String expectedName;
    private final float expectedPrice;

    public GetAvailableIngredientsTest(int arrayCount, IngredientType expectedType, String expectedName, float expectedPrice) {
        this.arrayCount = arrayCount;
        this.expectedType = expectedType;
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] setParameters() {
        return new Object[][] {
                {0, IngredientType.SAUCE, "hot sauce", 100},
                {1, IngredientType.SAUCE, "sour cream", 200},
                {2, IngredientType.SAUCE, "chili sauce", 300},
                {3, IngredientType.FILLING, "cutlet", 100},
                {4, IngredientType.FILLING, "dinosaur", 200},
                {5, IngredientType.FILLING, "sausage", 300}
        };
    }

    @Test
    public void availableIngredientsReturnsIngredientsData() {
        List<Ingredient> ingrs = database.availableIngredients();
        IngredientType actualType = ingrs.get(arrayCount).getType();
        String actualName = ingrs.get(arrayCount).getName();
        float actualPrice = ingrs.get(arrayCount).getPrice();
        Assert.assertEquals(expectedType, actualType);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedPrice, actualPrice, 0.0);
    }
}
