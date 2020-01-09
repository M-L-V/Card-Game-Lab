import org.junit.Test;

import static org.junit.Assert.*;

public class RankTypeTest {

    @Test
    public void shouldReturn12() {
        assertEquals(12, RankType.QUEEN.getValue());
    }

}