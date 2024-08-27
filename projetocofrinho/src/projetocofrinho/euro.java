package projetocofrinho;

public class euro extends moeda {
    public euro(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.0;   
    }

    @Override
    public String getNome() {
        return "euro";
    }
}
