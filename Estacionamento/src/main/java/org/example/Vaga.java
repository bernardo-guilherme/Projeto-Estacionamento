package org.example;

public class Vaga {
    private int numero;
    private boolean ocupada = false;
    Veiculo veiculoEstacionado;

    public boolean isOcupada() {
        return ocupada;
    }

    public Vaga(int numero, boolean ocupada, Veiculo veiculoEstacionado){
        this.numero=numero;
        this.ocupada=ocupada;
        this.veiculoEstacionado=veiculoEstacionado;
    }

    public void estacionar(Veiculo carro){
        if(this.ocupada) {
            System.out.println("A vaga esta ocupada.");
        }else{
            veiculoEstacionado = carro;
            this.ocupada = true;
            System.out.println("Carro estacionado.");
        }
    }

    public void liberar(){
        veiculoEstacionado = null;
        ocupada = false;
        System.out.println("Vaga liberada.");
    }
}
