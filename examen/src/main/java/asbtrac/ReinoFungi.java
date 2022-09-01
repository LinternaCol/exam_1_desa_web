package asbtrac;

import interfaces.SerVivo;

public abstract  class ReinoFungi implements SerVivo {
    public String reino = "ReinoFungi";

    //Constructor
    public ReinoFungi() {
    }
    @Override
    public String toString() {
        return "\"ReinoFungi\":{";
    }

    //Getters an setters
    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
