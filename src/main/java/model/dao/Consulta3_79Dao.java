package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta3_79Dao {
    public ArrayList<Consulta3VO_79> consulta3DAO(String i) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Consulta3VO_79> resultados = new ArrayList<Consulta3VO_79>();

        try{

            conn = JDBCUtilities.getConnection();
                    
            String sql = ("SELECT " + 
                "p.ID_Proyecto, " + 
                "l.Nombre || \" \" || l.Primer_Apellido AS nom_ape " +
                "FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " +
                "WHERE p.Banco_Vinculado == '"+i+"'"
            );
            
            pstmt = conn.prepareStatement(sql);
            // pstmt.setInt(i, j);

            rs = pstmt.executeQuery();

            while(rs.next()){
                String id_proyecto = rs.getString("ID_Proyecto");
                String nom_ape = rs.getString("nom_ape");
                resultados.add(new Consulta3VO_79(id_proyecto,nom_ape));
            }

            return resultados;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
        
    }  
}
