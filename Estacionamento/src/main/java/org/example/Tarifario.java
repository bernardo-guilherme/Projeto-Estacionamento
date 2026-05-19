package org.example;
import java.time.LocalDateTime;

public class Tarifario {
    private double valorHora;
    private double valorDiaria;
    private double valorSemana;
    private double valorMes;

    public double calcularValor(double totalHoras){
        if(totalHoras<24 && totalHoras>0){
            return totalHoras*valorHora;
        } else if (totalHoras>=24 && totalHoras<168) {
            return totalHoras*valorDiaria;
        } else if (totalHoras>=168 && totalHoras<720) {
            return totalHoras*valorSemana;
        }else{
            return totalHoras*valorMes;
        }
    }

}
