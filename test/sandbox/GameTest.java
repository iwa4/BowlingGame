package sandbox;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class GameTest {

    private Game g;

    @Before
    public void setUp() {
        g = new Game();
    }

    @Test
    public void testGutterGame() {
        rollMany(20, 0);
        assertThat(g.score(), is(0));
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1);
        assertThat(g.score(), is(20));
    }

    @Test
    public void testOneSpare() {
        g.roll(5);
        g.roll(5);
        g.roll(3);
        rollMany(17, 0);
        assertThat(g.score(), is(16));
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }
}