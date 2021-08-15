package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4_79 {  
         
    public static ArrayList<Consulta1VO_79> realizarConsulta1() throws SQLException{
        Consulta1_79Dao consulta = new Consulta1_79Dao();
        return consulta.consulta1DAO(4,12);
    }
    public static ArrayList<Consulta2VO_79> realizarConsulta2() throws SQLException{
        Consulta2_79Dao consulta2 = new Consulta2_79Dao();
        return consulta2.consulta2DAO(500000,650000);
    }
    public static ArrayList<Consulta3VO_79> realizarConsulta3() throws SQLException{
        Consulta3_79Dao consulta3 = new Consulta3_79Dao();
        return consulta3.consulta3DAO("Colpatria");
    }
    
}
