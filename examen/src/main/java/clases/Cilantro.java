package clases;

import asbtrac.ReinoVegetal;

public class Cilantro extends ReinoVegetal {
    private String name;
    private String color;
    private Double tiempoVida;
    private Double promedioVida;
    //Consturctor
    public Cilantro(String name, String color, Double tiempoVida, Double promedioVida) {
        this.name = name;
        this.color = color;
        this.tiempoVida = tiempoVida;
        this.promedioVida = promedioVida;
    }

    public Cilantro() {
    }
    @Override
    public String toString() {
        return "\"Cilantro\":{"
                +"\"name\":\"" + name
                +"\" ,\"color\":\"" + color
                +"\" ,\"tiempoVida\":\"" + tiempoVida
                +"\" ,\"promedioVida\":\"" + promedioVida +"}";
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPromedioVida() {
        return promedioVida;
    }

    public void setPromedioVida(Double promedioVida) {
        this.promedioVida = promedioVida;
    }

    public Double getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(Double tiempoVida) {
        this.tiempoVida = tiempoVida;
    }
}
