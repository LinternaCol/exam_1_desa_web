import clases.Brocoli;
import clases.Cilantro;
import clases.Perro;
import interfaces.SerVivo;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        SerVivo serVivo1= new Cilantro("Coriandrum sativum","Verde",0.2,1.0);
        SerVivo serVivo2= new Brocoli("Brassica oleracea var. italica","Verde",0.7,0.5);
        SerVivo serVivo3= new Cilantro("Coriandrum sativum","Verde",0.5,1.0);
        SerVivo serVivo4= new Perro("Canis lupus familiaris","negro",8.0,12.0);
        List<SerVivo> serVivoList= new ArrayList<SerVivo>();
        serVivoList.add(serVivo1);
        serVivoList.add(serVivo2);
        serVivoList.add(serVivo3);
        serVivoList.add(serVivo4);
        System.out.println(serVivoList);




    }
}
