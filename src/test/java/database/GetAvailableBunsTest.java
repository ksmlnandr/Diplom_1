package database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Database;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetAvailableBunsTest {

    private Database database = new Database();

    private final int arrayCount;
    private final String expectedName;
    private final float expectedPrice;

    public GetAvailableBunsTest(int arrayCount, String expectedName, float expectedPrice) {
        this.arrayCount = arrayCount;
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }


    @Parameterized.Parameters
    public static Object[][] setParameters() {
        return new Object[][]{
                {0, "black bun", 100},
                {1, "white bun", 200},
                {2, "red bun", 300}
        };
    }

    @Test
    public void availableBunsReturnsBunsData() {
        List<Bun> buns = database.availableBuns();
        String actualName = buns.get(arrayCount).getName();
        float actualPrice = buns.get(arrayCount).getPrice();
        assertEquals(expectedName, actualName);
        assertEquals(expectedPrice, actualPrice, 0.0);
    }
}