package asbtrac;

import interfaces.SerVivo;

public abstract class ReinoProtista implements SerVivo {
    public String reino = "ReinoProtista";

    //Constructor
    public ReinoProtista() {
    }
    @Override
    public String toString() {
        return "\"ReinoProtista\":{"
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
