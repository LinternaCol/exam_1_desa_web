package asbtrac;

import interfaces.SerVivo;

public abstract  class ReinoMonera implements SerVivo {
    public String reino = "ReinoMonera";

    //Constructor
    public ReinoMonera() {
    }
    @Override
    public String toString() {
        return "\"ReinoMonera\":{"
                +"\"reino\":\"" + reino;
    }

    //Getters an setters
    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
