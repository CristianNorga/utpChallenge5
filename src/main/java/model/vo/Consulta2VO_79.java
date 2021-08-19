package model.vo;

import java.util.ArrayList;

public class Consulta2VO_79 {
    String nombre;
    String salario;
    String deducible;
    String apellidos;

    public Consulta2VO_79(String val1, String val2, String val3, String val4){
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

    public static String[][] ToArrayString(ArrayList<Consulta2VO_79> val){

        Integer numFiles = val.size();
        String data[][];
        data =  new String[numFiles][4];

        int x = 0;
        for (Consulta2VO_79 item : val) {
            data[x][0] = item.nombre;
            data[x][1] = item.salario;
            data[x][2] = item.deducible;
            data[x][3] = item.apellidos;
            x++;
        }
        return data;
    }
}
