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
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertThat(g.score(), is(0));
    }

    @Test
    public void testAllOnes() {
        for (int i = 0; i < 20; i++) {
            g.roll(1);
        }
        assertThat(g.score(), is(20));
    }
}