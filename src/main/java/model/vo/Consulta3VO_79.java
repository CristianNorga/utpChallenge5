package model.vo;

import java.util.ArrayList;

public class Consulta3VO_79 {
    Integer ip_proyecto;
    String nombre;

    public Consulta3VO_79(Integer val1, String val2){
        this.ip_proyecto = val1;
        this.nombre = val2;
    }

    public static void ImprimirResultados(ArrayList<Consulta3VO_79> val1){
        for (Consulta3VO_79 item: val1) {
            System.out.printf("%d %s \n",item.ip_proyecto,item.nombre);
        }
    }
}
