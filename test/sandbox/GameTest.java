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
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertThat(g.score(), is(16));
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertThat(g.score(), is(24));
    }

    @Test
    public void pergectGame() {
        rollMany(12, 10);
        assertThat(g.score(), is(300));
    }

    @Test
    public void 受入テスト() {
        g.roll(1);
        g.roll(4);
        g.roll(4);
        g.roll(5);
        g.roll(6);
        g.roll(4);
        g.roll(5);
        g.roll(5);
        g.roll(10);
        g.roll(0);
        g.roll(1);
        g.roll(7);
        g.roll(3);
        g.roll(6);
        g.roll(4);
        g.roll(10);
        g.roll(2);
        g.roll(8);
        g.roll(6);
        assertThat(g.score(), is(133));
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private void rollStrike() {
        g.roll(10);
    }
}