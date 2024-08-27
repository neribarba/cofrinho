package projetocofrinho;

import java.util.ArrayList;

public class cofrinho {
    private ArrayList<moeda> moedas;

    public cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(moeda moeda) {
        moedas.remove(moeda);
    }

    public void listarMoedas() {
        for (moeda moeda : moedas) {
            System.out.println(moeda.getNome() + ": " + moeda.getValor());
        }
    }

    public double calcularTotalEmReais() {
        double total = 0;
        for (moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}

