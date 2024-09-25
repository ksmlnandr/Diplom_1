package burger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AddIngredientTest {

    Burger burger = new Burger();
    List<Ingredient> ingredients = burger.ingredients;
    @Mock
    Ingredient ingredient = new Ingredient(IngredientType.FILLING, "meat ball", 4.0F);

    @Test
    public void addIngredientCallsAddition() {
        int initialSize = ingredients.size();
        burger.addIngredient(ingredient);
        Assert.assertNotEquals(ingredients.size(),initialSize);
    }
}
