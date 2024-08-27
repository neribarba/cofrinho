package projetocofrinho;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cofrinho cofrinho = new cofrinho();
       
        
  
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em reais");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            if (escolha == 5) {
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.println("Escolha a moeda (1- Dolar, 2- Euro, 3- Real):");
                    int tipoMoeda = scanner.nextInt();
                    System.out.println("Digite o valor:");
                    double valor = scanner.nextDouble();
                    moeda moeda = null;
                    if (tipoMoeda == 1) {
                        moeda = new dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new euro(valor);
                    } else if (tipoMoeda == 3) {
                        moeda = new real(valor);
                    }
                    if (moeda != null) {
                        cofrinho.adicionarMoeda(moeda);
                    }
                    break;
                case 2:
                    System.out.println("Escolha a moeda para remover (1- Dolar, 2- Euro, 3- Real):");
                    tipoMoeda = scanner.nextInt();
                    System.out.println("Digite o valor:");
                    valor = scanner.nextDouble();
                    moeda = null;
                    if (tipoMoeda == 1) {
                        moeda = new dolar(valor);
                    } else if (tipoMoeda == 2) {
                        moeda = new euro(valor);
                    } else if (tipoMoeda == 3) {
                        moeda = new real(valor);
                    }
                    if (moeda != null) {
                        cofrinho.removerMoeda(moeda);
                    }
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    double total = cofrinho.calcularTotalEmReais();
                    System.out.println("Total em reais: " + total);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}

