package org.example;

public class Veiculo {
    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo){
          System.out.print("Digite o modelo de seu veiculo :");
          setModelo(modelo);
          setPlaca(placa);
    }

    public void setPlaca(String placa){
        this.placa= this.placa;
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
