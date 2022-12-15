import java.util.Iterator;

public class Checagem {

    public static Integer contarUnidadesDeUmModelo(Estoque estoque, String modelo){
        int quantidade = 0;
        for(Produto produto : estoque){
            if(produto.getModelo() == modelo){
                quantidade+=1;
            }
        }
        return quantidade;
    }

    public static Integer contarProdutosEmEstoque(Estoque estoque){
        int quantidade = 0;
        for (Produto produto : estoque) {
            quantidade+=1;
        }
        return quantidade;
    }
}
