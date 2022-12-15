import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChecagemTest {
    Produto produto1;
    Produto produto2;
    Produto produto3;
    Produto produto4;
    Estoque estoque;

    @BeforeEach
    void setUp(){
        produto1 = new Produto("Mondial", "Aspirador de pó");
        produto2 = new Produto("Mondial", "Liquidificador");
        produto3 = new Produto("Electrolux" , "Geladeira");
        produto4 = new Produto("Caloi", "Bicicleta");
    }

    @Test
    void deveContarUnidadesDeUmModelo(){
        estoque = new Estoque(
                produto1,
                produto1,
                produto2,
                produto3,
                produto1
        );
        assertEquals(3, Checagem.contarUnidadesDeUmModelo(estoque, "Aspirador de pó"));
    }

    @Test
    void deveChecarMarcasEmEstoque(){
        estoque = new Estoque(
                produto3,
                produto4,
                produto3,
                produto4,
                produto2,
                produto1
        );

        assertEquals(6, Checagem.contarProdutosEmEstoque(estoque));
    }
}