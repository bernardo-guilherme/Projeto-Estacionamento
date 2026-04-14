package org.example;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Veiculo {
    private String placa;
    private String modelo;

    public Veiculo(){
        boolean erro=false;
        do {
            Scanner entrada = new Scanner(System.in);
            String placa, modelo;
            System.out.println("Qual o modelo do seu veiculo?");
            setModelo(entrada.nextLine());
            System.out.println("Qual a placa do seu veiculo?");
            setPlaca(entrada.nextLine());
            if((this.modelo.isEmpty()) && (this.placa.isEmpty())){
                JOptionPane.showMessageDialog(null,"É preciso cadastrar o modelo e a placa do veiculo.");
                erro=true;
            } else if ((!(this.modelo.isEmpty())) && (this.placa.isEmpty())) {
                JOptionPane.showMessageDialog(null,"É preciso cadastrar a placa do veiculo.");
                erro=true;
            } else if ((!(this.modelo.isEmpty())) && (this.placa.isEmpty())) {
                JOptionPane.showMessageDialog(null,"É preciso cadastrar o modelo do veiculo.");
                erro=true;
            }else{
                erro=false
            }
        }while(erro);   
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
