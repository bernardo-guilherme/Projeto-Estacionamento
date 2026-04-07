package org.example;
import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private Veiculo carro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public void registrarSaida(){
        horaSaida = LocalDateTime.now();
        System.out.println("Saida resgistrada.");
    }
    public void calcularTempoEmHoras(){
        System.out.printf("Tempo de permanencia: " + Duration.between(horaEntrada, horaSaida));
    }
}
