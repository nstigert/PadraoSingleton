import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void retornaQtdVendasGeral() {
        Loja.getInstance().vender();
        assertEquals(1, Loja.getInstance().getQtdVendasGeral());
    }
}