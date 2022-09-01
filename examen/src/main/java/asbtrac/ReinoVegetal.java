package asbtrac;

import interfaces.SerVivo;

public  abstract  class  ReinoVegetal implements SerVivo {
    public String reino = "ReinoVegetal";

    //Constructor
    public ReinoVegetal() {
    }
    @Override
    public String toString() {
        return "\"ReinoVegetal\":{";
    }

    //Getters an setters
    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
