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

public class Consulta2_79Dao {
    public ArrayList<Consulta2VO_79> consulta2DAO(int i, int j) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Consulta2VO_79> resultados = new ArrayList<Consulta2VO_79>();

        try{

            conn = JDBCUtilities.getConnection();

            String sql = ("SELECT " + 
                "l.Nombre, " + 
                "l.Salario, " +
                "l.Salario * 8.00/ 100 AS deducible, " +
                "l.Primer_Apellido || \"-\" || l.Segundo_Apellido AS apellidos " +
                "FROM Lider l " +
                "WHERE l.Salario >= "+i+" AND l.Salario  <= "+j
            );
            
            pstmt = conn.prepareStatement(sql);
            // pstmt.setInt(i, j);

            rs = pstmt.executeQuery();

            while(rs.next()){
                String nombre = rs.getString("Nombre");
                String salario = rs.getString("Salario");
                String deducible = rs.getString("deducible");
                String apellidos = rs.getString("apellidos");
                resultados.add(new Consulta2VO_79(nombre,salario,deducible, apellidos));
            }

            return resultados;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }  
}
