package asbtrac;

import interfaces.SerVivo;

public abstract class ReinoAnimal implements SerVivo {
    public String reino = "ReinoAnimal";

    //Constructor
    public ReinoAnimal() {
    }
    @Override
    public String toString() {
        return "\"ReinoAnimal\":{"
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
