package database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Database;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class GetAvailableBunsTest {

    private Database database = new Database();

    private final int arrayCount;

    private final Bun expected;

    public GetAvailableBunsTest(int arrayCount, Bun expected) {
        this.arrayCount = arrayCount;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] setParameters() {
        return new Object[][]{
                {0, new Bun("black bun", 100)},
                {1, new Bun( "white bun", 200)},
                {2, new Bun("red bun", 300)}
        };
    }

    @Test
    public void availableBunsReturnsBunsData() {
        List<Bun> buns = database.availableBuns();
        Bun actual = buns.get(arrayCount);
        assertEquals(expected, actual);
    }
}