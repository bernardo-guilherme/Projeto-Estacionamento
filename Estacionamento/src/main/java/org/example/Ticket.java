package org.example;
import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private Veiculo carro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private double valorFinal;

    public void registrarSaida(){
        horaSaida = LocalDateTime.now();
        System.out.println("Saida resgistrada.");
    }
    public void calcularTempoEmHoras(){
        if(horaSaida = null){
            System.out.printf("Nao eh possivel calcular o tempo de permanencia, pois nao ha hora de saida");
        }else{
            System.out.printf("Tempo de permanencia: " + Duration.between(horaEntrada, horaSaida));
            valorFinal = calcualrValor(Duration.between(horaEntrada, horaSaida));
    }
}
