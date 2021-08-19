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

public class Consulta1_79Dao {
    public ArrayList<Consulta1VO_79> consulta1DAO(int i, int j) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Consulta1VO_79> resultados = new ArrayList<Consulta1VO_79>();

        try{

            conn = JDBCUtilities.getConnection();

            String sql = ("SELECT " + 
                "p.ID_Proyecto, " + 
                "p.Fecha_Inicio, " +
                "p.Banco_Vinculado, " +
                "p.Banco_Vinculado , " +
                "p.Serial " +
                "FROM Proyecto p " +
                "WHERE p.ID_Proyecto > "+i+" AND p.ID_Proyecto < "+j
            );
            
            pstmt = conn.prepareStatement(sql);
            // pstmt.setInt(i, j);

            rs = pstmt.executeQuery();

            while(rs.next()){
                String id_proyecto = rs.getString("ID_Proyecto");
                String fecha_inicio = rs.getString("Fecha_Inicio");
                String banco_vinculado = rs.getString("Banco_Vinculado");
                String serial = rs.getString("Serial");
                resultados.add(new Consulta1VO_79(id_proyecto,fecha_inicio,banco_vinculado, serial));
            }

            return resultados;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
        
    }  
}
