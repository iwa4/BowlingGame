package sandbox;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class GameTest {

    @Test
    public void testGutterGame() {
        Game g = new Game();
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertThat(g.score(), is(0));
    }
}