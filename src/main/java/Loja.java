public class Loja {
    private static Loja instance;
    private int qtdVendasGeral;
    private Loja() {
    }
    public void vender(){
        this.qtdVendasGeral++;
    }
    public static Loja getInstance() {
        if (instance == null) {
            instance = new Loja();
        }
        return instance;
    }

    public int getQtdVendasGeral(){
        return this.qtdVendasGeral;
    }


}

