package burger;

import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetReceiptTest {
    private Bun bun;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Burger burger;

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
    }

    @Test
    public void getReceiptReturnsBurgerVisualWithTotalPrice() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        String expectedReceipt = "(==== tasty bun ====)\n" +
                "= filling meat ball =\n" +
                "= sauce tomato sauce =\n" +
                "(==== tasty bun ====)\n" +
                "\nPrice: 14,000000\n";
        String actualReceipt = burger.getReceipt();
        assertEquals(expectedReceipt, actualReceipt);
    }
}
