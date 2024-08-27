package projetocofrinho;

public abstract class moeda {

	protected double valor;

    public moeda(double valor2) {
		
	}

	public void  Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract double converterParaReal();
    public abstract String getNome();
}

