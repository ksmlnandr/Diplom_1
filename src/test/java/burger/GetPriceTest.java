package burger;

import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;
import recources.constants.Constants;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetPriceTest {
    private Bun bun;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Burger burger;
    private Constants constants = new Constants();

    @Before
    public void setUp() {
        bun = mock(Bun.class);
        when(bun.getPrice()).thenReturn(2.0F);
        when(bun.getName()).thenReturn("tasty bun");

        ingredient1 = mock(Ingredient.class);
        when(ingredient1.getPrice()).thenReturn(4.0F);
        when(ingredient1.getName()).thenReturn("meat ball");
        when(ingredient1.getType()).thenReturn(IngredientType.FILLING);

        ingredient2 = mock(Ingredient.class);
        when(ingredient2.getPrice()).thenReturn(6.0F);
        when(ingredient2.getName()).thenReturn("tomato sauce");
        when(ingredient2.getType()).thenReturn(IngredientType.SAUCE);

        burger = new Burger();

        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
    }

    @Test
    public void getPriceCountsSumOfBunsAndTwoIngredients() {
        float expectedPrice = bun.getPrice() * 2 + ingredient1.getPrice() + ingredient2.getPrice();
        assertEquals(expectedPrice, burger.getPrice(), constants.getDELTA());
    }
}
