package view;

import controller.*;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4_79 {
    
    public static final ControladorRequerimientosReto4_79 controlador = new ControladorRequerimientosReto4_79();


    public static void consulta1(){
        System.out.println("-----Consulta 1-------");
        try{

            ArrayList<Consulta1VO_79> lista = ControladorRequerimientosReto4_79.realizarConsulta1();

            //Encabezado del resultado
            System.out.println("id_proyecto, Fecha_Inicio , banco_vinculado , serial" );
            
            //Cada VO cargado, mostrarlo en la vista
            Consulta1VO_79.ImprimirResultados(lista);
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }

    public static void consulta2(){
        System.out.println("-----Consulta 2-------"); 
        try{

            ArrayList<Consulta2VO_79> lista = ControladorRequerimientosReto4_79.realizarConsulta2();

            //Encabezado del resultado
            System.out.println("nombre, salario, deducible, apellidos" );
            
            //Cada VO cargado, mostrarlo en la vista
            Consulta2VO_79.ImprimirResultados(lista);
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }


    public static void consulta3(){
        System.out.println("-----Consulta 3-------"); 
        try{

            ArrayList<Consulta3VO_79> lista = ControladorRequerimientosReto4_79.realizarConsulta3();

            //Encabezado del resultado
            System.out.println("id_proyecto, nom_ape");
            
            //Cada VO cargado, mostrarlo en la vista
            Consulta3VO_79.ImprimirResultados(lista);
            
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }
}
