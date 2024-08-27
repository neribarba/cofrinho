package projetocofrinho;

public class real extends moeda {
    public real(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor;  
    }

    @Override
    public String getNome() {
        return "real";
    }
}
