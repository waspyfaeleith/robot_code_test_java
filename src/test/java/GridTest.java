import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GridTest {
    Grid grid;

    @Before
    public void setUp() {
        grid = new Grid(5,3);
    }

    @Test
    public void gridXSetUp() {
        assertEquals(6, grid.getSquares().length);
    }

    @Test
    public void gridYSetUp() {
        assertEquals(4, grid.getSquares()[4].length);
    }

    @Test
    public void warningScentInitiallyFalse() {
        assertFalse(grid.hasWarningScent(1,1));
    }

    @Test
    public void warningCanSetSquare() {
        grid.setSquare(1,1, 'x');
        assertTrue(grid.hasWarningScent(1,1));
    }

}
