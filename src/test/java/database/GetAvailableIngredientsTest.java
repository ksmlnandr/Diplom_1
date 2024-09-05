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
    private final Ingredient expected;

    public GetAvailableIngredientsTest(int arrayCount, Ingredient expected) {
        this.arrayCount = arrayCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setParameters() {
        return new Object[][] {
                {0, new Ingredient(IngredientType.SAUCE, "hot sauce", 100)},
                {1, new Ingredient(IngredientType.SAUCE, "sour cream", 200)},
                {2, new Ingredient(IngredientType.SAUCE, "chili sauce", 300)},
                {3, new Ingredient(IngredientType.FILLING, "cutlet", 100)},
                {4, new Ingredient(IngredientType.FILLING, "dinosaur", 200)},
                {5, new Ingredient(IngredientType.FILLING, "sausage", 300)}
        };
    }

    @Test
    public void availableIngredientsReturnsIngredientsData() {
        List<Ingredient> ingredients = database.availableIngredients();
        Ingredient actual = ingredients.get(arrayCount);
        Assert.assertEquals(expected, actual);
    }
}
