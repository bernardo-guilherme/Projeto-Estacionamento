package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Estacionamento> estacionamentos = new ArrayList<Estacionamento>();
        ArrayList<Veiculo> veiculos= new ArrayList<Veiculo>();
        System.out.printf("Teste: ");
        do{
            System.out.println("1. registrar entrada");
            System.out.println("2. registrar saida");
            System.out.println("3. exibir vagas livres");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Usuario digitou a opcao: "+ opcao);

            switch (opcao){
                case 1:
                    String placa, modelo;
                    boolean verificacaoDePlaca;
                    System.out.print("digite o modelo do seu veiculo: ");
                    modelo = entrada.nextLine();
                    System.out.print("digite a placa do seu veiculo");
                    placa = entrada.nextLine();
                    if(veiculos.isEmpty()) {
                        veiculos.add(new Veiculo(placa, modelo));
                    } else {


                        }
                        if(verificacaoDePlaca){
                            System.out.println("Nao eh possivel cadastrar o veiculo porque ja existe um veiculo com a placa igual");
                            placa = "";
                            modelo = "";
                        }
                    }
            }
        }while(opcao !=4);
        System.out.println("Usuario saiu do sistema");
    }
}
