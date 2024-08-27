package projetocofrinho;

public class dolar extends moeda {
    public dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.0;  
    }

    @Override
    public String getNome() {
        return "dolar";
    }
}
