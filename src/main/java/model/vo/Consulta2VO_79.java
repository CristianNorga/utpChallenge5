package model.vo;

import java.util.ArrayList;

public class Consulta2VO_79 {
    String nombre;
    Integer salario;
    Double deducible;
    String apellidos;

    public Consulta2VO_79(String val1, Integer val2, Double val3, String val4){
        this.nombre = val1;
        this.salario = val2;
        this.deducible = val3;
        this.apellidos = val4;
    }

    public static void ImprimirResultados(ArrayList<Consulta2VO_79> val1){
        for (Consulta2VO_79 item: val1) {
            System.out.printf("%s %d %f %s \n",item.nombre,item.salario,item.deducible,item.apellidos);
        }
    }
}
