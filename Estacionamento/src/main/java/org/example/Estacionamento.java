package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private ArrayList<Vaga> vagas = new ArrayList<Vaga>(List.of(
            new Vaga(1, false, null),
            new Vaga(2, false, null),
            new Vaga(3, false, null),
            new Vaga(4, false, null),
            new Vaga(5, false, null),
            new Vaga(6, false, null),
            new Vaga(7, false, null),
            new Vaga(8, false, null),
            new Vaga(9, false, null),
            new Vaga(10, false, null),
            new Vaga(11, false, null),
            new Vaga(12, false, null)
    ));
    private ArrayList<Ticket> ticketsAbertos = new ArrayList<Ticket>();
    private Tarifario tarifario = new Tarifario();

    public void registrarEntrada(Veiculo carro){
        for(Vaga v : vagas){
            if (v.isOcupada()){
                v.estacionar(carro);
                ticketsAbertos.add(new Ticket(carro, LocalDateTime.now()));
                break;
            }
        }
    }
    public void registrarSaida(){
        //int i=0;
        //Ticket ticket = ticketsAbertos.get(i);
    }
    public void exibirVagasLivres(){

    }
}
