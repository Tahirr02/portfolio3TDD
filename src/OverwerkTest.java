import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverwerkTest {

    @Test
    void getOverWerkPercentage() {
        assertEquals (80, Overwerk.getOverWerkPerecntage ("doordeweeks", true, true, "kok"));
        assertEquals (35, Overwerk.getOverWerkPerecntage ("doordeweeks", false, false, "bediening"));
        assertEquals (90, Overwerk.getOverWerkPerecntage ("weekend", true, false, "kok"));
        assertEquals (85, Overwerk.getOverWerkPerecntage ("weekend", false, true, "bediening"));
        assertEquals (125, Overwerk.getOverWerkPerecntage ("feestdag", true, false, "bediening"));
        assertEquals (150, Overwerk.getOverWerkPerecntage ("feestdag", false, true, "kok"));
    }
}