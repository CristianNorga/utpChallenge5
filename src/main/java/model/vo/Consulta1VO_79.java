package model.vo;

import java.sql.Date;
import java.util.ArrayList;

public class Consulta1VO_79 {
    Integer id_proyecto;
    Date fecha_inicio;
    String banco_vinculado;
    String serial;

    public Consulta1VO_79(Integer val1, Date val2, String val3, String val4){
        this.id_proyecto = val1;
        this.fecha_inicio = val2;
        this.banco_vinculado = val3;
        this.serial = val4;
    }

    public static void ImprimirResultados(ArrayList<Consulta1VO_79> val1){
        for (Consulta1VO_79 item: val1) {
            System.out.printf("%d %s %s %s \n",item.id_proyecto,item.fecha_inicio,item.banco_vinculado,item.serial);
        }
    }
    
}
