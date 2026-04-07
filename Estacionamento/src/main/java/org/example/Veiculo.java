package org.example;
import java.util.Scanner;

public class Veiculo {
    private String placa;
    private String modelo;

    public Veiculo(){
        Scanner entrada = new Scanner(System.in);
        String placa, modelo;
        System.out.println("Qual o modelo do seu veiculo?");
        modelo = entrada.nextLine();
        System.out.println("Qual a placa do seu veiculo?");
        placa = entrada.nextLine();
    }

    public void setPlaca(){
        this.placa=placa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
