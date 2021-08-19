package view;
import javax.swing.JPanel;
import javax.swing.*;
// import javax.swing.event.*;
// import javax.swing.table.TableModel;
import model.vo.*;
// import java.awt.*;
import java.util.ArrayList;

public class Table extends JPanel {
    // private String data[][];
    // JTable;
    JTable tabla;
    JScrollPane sPanel;

    public Table() {
        // setLayout(new BorderLayout());
        // setLayout(new BorderLayout());
        
        // String [][]array = new String[data.size()][data.size()];
        // String [][]dataParce = data.toArray(dataParce);
        this.tabla = new JTable();
        this.sPanel = new JScrollPane(this.tabla);
        add(this.sPanel);
        // add(panel, BorderLayout.CENTER);
    }

    public void showTable1(){
        removeAll();
        ArrayList<Consulta1VO_79> data = VistaRequerimientosReto4_79.consulta1();
        String[] nameColums = {
            "id_proyecto","fecha_inicio","banco_vinculado","serial"
        };
        this.tabla = new JTable(Consulta1VO_79.ToArrayString(data),nameColums);
        this.sPanel = new JScrollPane(this.tabla);
        add(this.sPanel);
    }

    public void showTable2(){
        removeAll();
        ArrayList<Consulta2VO_79> data = VistaRequerimientosReto4_79.consulta2();
        String[] nameColums = {
            "Nombre","Salario","deducible","apellidos"
        };
        this.tabla = new JTable(Consulta2VO_79.ToArrayString(data),nameColums);
        this.sPanel = new JScrollPane(this.tabla);
        add(this.sPanel);
    }

    public void showTable3(){
        removeAll();
        ArrayList<Consulta3VO_79> data = VistaRequerimientosReto4_79.consulta3();
        String[] nameColums = {
            "ID_Proyecto","nom_ape"
        };
        this.tabla = new JTable(Consulta3VO_79.ToArrayString(data),nameColums);
        this.sPanel = new JScrollPane(this.tabla);
        add(this.sPanel);
    }
    // String []dsf = new String[al.size()];
    // al.toArray(dsf);
    // public static void showTable(String[] args) {
        // frame.getContentPane().add(new Table(), BorderLayout.CENTER);
        // frame.setSize(400, 150);
        // frame.setLocationRelativeTo(null);
        // frame.setVisible(true);
    // }
}
