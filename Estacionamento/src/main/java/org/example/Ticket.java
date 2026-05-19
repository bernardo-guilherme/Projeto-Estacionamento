package org.example;
import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private Veiculo carro;
    private final LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public Ticket(Veiculo carro, LocalDateTime horaEntrada){
        this.carro = carro;
        this.horaEntrada = horaEntrada;
    }
    public void registrarSaida(){
        horaSaida = LocalDateTime.now();
        System.out.println("Saida resgistrada.");
    }
    public double calcularTempoEmHoras(){
        return (double) Duration.between(horaEntrada, horaSaida).toMinutes() /60;
    }
}
