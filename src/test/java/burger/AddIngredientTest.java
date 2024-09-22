package burger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AddIngredientTest {
    Burger burger = new Burger();
    Ingredient ingredient = new Ingredient(IngredientType.FILLING, "meat ball", 4.0F);
    @Mock
    List<Ingredient> ingredients = new ArrayList<>();


    @Test
    public void addIngredientCallsAddition() {
        burger.addIngredient(ingredient);
        Mockito.when(ingredients.get(0)).thenReturn(ingredient);
        Assert.assertEquals(ingredient, ingredients.get(0));
    }
}
