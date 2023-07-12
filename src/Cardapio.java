import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(itens, itens.length + 1);
        this.itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
       ItemCardapio[] item = Arrays.copyOf(itens, itens.length - 1);

       System.arraycopy(itens, 0, item, 0, indice);
       System.arraycopy(itens, indice + 1, item, indice, item.length - indice);

       itens = Arrays.copyOf(item, item.length);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // TODO implementar código para imprimir na console os itens
        // do cardápio que estiverem entre o preço mínimo e máximo
        for (ItemCardapio iten : itens) {
            if (iten.preco > precoMinimo && iten.preco < precoMaximo) {
                System.out.println("Nome do prato: " + iten.descricao);
                System.out.printf("valor do prato: R$ %.2f%n ", iten.preco);
                System.out.println("--------------------------------");
            }
        }
    }

    void imprimirItensCardapio() {
        for (ItemCardapio iten : itens) {
            System.out.println("Nome do prato: " + iten.descricao);
            System.out.printf("valor do prato: R$ %.2f%n ", iten.preco);
            System.out.println("--------------------------------");
        }
    }

}


