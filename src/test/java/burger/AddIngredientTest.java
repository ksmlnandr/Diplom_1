package burger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

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
