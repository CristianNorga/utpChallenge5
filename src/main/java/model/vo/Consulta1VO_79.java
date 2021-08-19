package model.vo;

import java.util.ArrayList;

public class Consulta1VO_79 {
    String id_proyecto;
    String fecha_inicio;
    String banco_vinculado;
    String serial;

    public Consulta1VO_79(String id_proyecto2, String fecha_inicio2, String val3, String val4){
        this.id_proyecto = id_proyecto2;
        this.fecha_inicio = fecha_inicio2;
        this.banco_vinculado = val3;
        this.serial = val4;
    }

    public static void ImprimirResultados(ArrayList<Consulta1VO_79> val1){
        for (Consulta1VO_79 item: val1) {
            System.out.printf("%d %s %s %s \n",item.id_proyecto,item.fecha_inicio,item.banco_vinculado,item.serial);
        }
    }

    public static String[][] ToArrayString(ArrayList<Consulta1VO_79> val){

        Integer numFiles = val.size();
        String data[][];
        data =  new String[numFiles][4];

        int x = 0;
        for (Consulta1VO_79 item : val) {
            data[x][0] = item.id_proyecto;
            data[x][1] = item.fecha_inicio;
            data[x][2] = item.banco_vinculado;
            data[x][3] = item.serial;
            x++;
        }
        return data;
        // System.out.printf("%d %s %s %s \n",item.id_proyecto,item.fecha_inicio,item.banco_vinculado,item.serial);
    }
    
}
