import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaandsalarisTest {

    @Test
    void getJaartal() {
        Maandsalaris maandsalaris = new Maandsalaris(330,13);
        assertFalse(maandsalaris.isDatumCorrect());
    }
}