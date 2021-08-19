package model.vo;

import java.util.ArrayList;

public class Consulta3VO_79 {
    String ip_proyecto;
    String nombre;

    public Consulta3VO_79(String val1, String val2){
        this.ip_proyecto = val1;
        this.nombre = val2;
    }

    public static void ImprimirResultados(ArrayList<Consulta3VO_79> val1){
        for (Consulta3VO_79 item: val1) {
            System.out.printf("%d %s \n",item.ip_proyecto,item.nombre);
        }
    }

    public static String[][] ToArrayString(ArrayList<Consulta3VO_79> val){

        Integer numFiles = val.size();
        String data[][];
        data =  new String[numFiles][2];

        int x = 0;
        for (Consulta3VO_79 item : val) {
            data[x][0] = item.ip_proyecto;
            data[x][1] = item.nombre;
            x++;
        }
        return data;
        // System.out.printf("%d %s %s %s \n",item.id_proyecto,item.fecha_inicio,item.banco_vinculado,item.serial);
    }
}
