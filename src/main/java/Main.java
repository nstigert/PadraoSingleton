public class Main {
    public static void main(String[] args) {
        Loja matriz = Loja.getInstance();

        Loja filial1 = Loja.getInstance();
        filial1.vender();

        System.out.println("Quantidade de vendas geral: " + matriz.getQtdVendasGeral());

        Loja filial2 = Loja.getInstance();
        filial2.vender();
        filial2.vender();
        filial2.vender();

        System.out.println("Quantidade de vendas geral: " + matriz.getQtdVendasGeral());

    }
}
