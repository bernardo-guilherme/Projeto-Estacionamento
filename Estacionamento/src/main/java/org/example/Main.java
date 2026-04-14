package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Veiculo> Veiculos= new ArrayList<>();
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
                    Veiculos.add(new Veiculo());
            }
        }while(opcao !=4);
        System.out.println("Usuario saiu do sistema");
    }
}
