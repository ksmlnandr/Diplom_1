package burger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AddIngredientTest {
    @Spy
    Burger burger = new Burger();
    Ingredient ingredient = new Ingredient(IngredientType.FILLING, "meat ball", 4.0F);

    @Test
    public void addIngredientCallsAddition() {
        burger.addIngredient(ingredient);
        Mockito.verify(burger, times(1)).addIngredient(ingredient);
    }
}
