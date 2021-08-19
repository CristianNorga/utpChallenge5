package view;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.*;
// import view.Table;

public class VistaGrafica extends JFrame {
    
    Container c;
    String OpcionQueri;
    JPanel JpanelQueri = new JPanel();
    String dataQueri[][] = {{"<p>Seleccione el id del proyecto, la fecha de inicio, la entidad bancaria y el serial de los proyectos que tengan</p> <p>como id de proyecto los números entre 4 y 12 SIN INCLUIR LOS EXTREMOS.</p>", "<p>Seleccione el id del proyecto y como segunda y última columna el nombre del cliente concatenado</p> <p>con su primer apellido separados por un espacio con el nombre de la columna como nom_ape, y la condición deberá ser que todos los proyectos seleccionados pertenezcan a la entidad bancaria “Colpatria”.</p>"},{"<p> Seleccione el nombre, salario, el deducible de pago de las ganancias del cliente en una columna que se llame “deducible” y los dos apellidos</p> <p>concatenados y separados por un guion “-“ en otra columna de nombre “apellidos”. Solo seleccione los registros que tengan una ganancia entre 500000 y 650000 incluyendo los extremos.</p>","<p>Seleccione el id del proyecto y como segunda y última columna el nombre del cliente concatenado con su primer apellido</p> <p>separados por un espacio con el nombre de la columna como nom_ape, y</p><p> la condición deberá ser que todos los proyectos seleccionados pertenezcan a la entidad bancaria “Colpatria”.</p>"}};
    JRadioButton radius1 = new JRadioButton();
    JRadioButton radius2 = new JRadioButton();
    Table panelResults = new Table();

    public void inicializar(String titulo){
        this.c = this.getContentPane();
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setTitle(titulo);
    }

    public void initEstructura(String descripcion){

        panelIzquierdo(descripcion);
        panelCentral();

    }

    public void panelIzquierdo(String descripcion){
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.add(new JLabel(descripcion));
        panelIzquierdo.add(new JButton("Challenge5"));
        this.c.add(panelIzquierdo,BorderLayout.WEST);
    }

    public void panelCentral(){

        JPanel panelCentral = new JPanel();

        panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));
        
        // LABEL
        JLabel l = new JLabel("¿Su consulta esta relacionada a?");
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelCentral.add(l);

        // Combo Box
        JPanel panelComboBox = new JPanel();
        panelComboBox.setLayout(new FlowLayout());
        JComboBox<String> cb = new JComboBox<String>();
        for(String item : new ArrayList<>(Arrays.asList("Seleccione una opcion","Proyecto","Cliente"))){
            cb.addItem(item);
        }
        cb.setFont(new Font("Arial", Font.BOLD, 20));
        panelComboBox.add(cb);
        JButton botonConsultar = new JButton("Consultar");
        botonConsultar.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                showQueris(cb.getSelectedItem());
            }
        });
        panelComboBox.add(botonConsultar);
        panelCentral.add(panelComboBox);

        // resultados del Queri
        this.JpanelQueri.setLayout(new FlowLayout());
        panelCentral.add(this.JpanelQueri);

        //tabla resultados
        this.panelResults.setAlignmentY(Component.CENTER_ALIGNMENT);;
        panelCentral.add(this.panelResults);

        this.c.add(panelCentral,BorderLayout.CENTER);
    }

    public void showQueris(Object selected){
        String opcion = selected.toString();
        
        switch (opcion) {
            case "Seleccione una opcion":

                break;
            case "Proyecto":
                if(this.OpcionQueri == "Proyecto"){
                    break;
                }
                JpanelQueri.removeAll();
                assembleJpanelQuery("Proyecto");
                break;
                case "Cliente":
                if(this.OpcionQueri == "Cliente"){
                    break;
                }
                JpanelQueri.removeAll();
                assembleJpanelQuery("Cliente");
                break;
            default:
                break;
        }
        this.OpcionQueri = opcion;
        // this.c.repaint();
        // this.JpanelQueri.repaint();
        // this.JpanelQueri.setVisible(true);
        // this.JpanelQueri.updateUI();
    }

    public void assembleJpanelQuery(String option){

        int index;
        if(option == "Proyecto"){
            index = 0;
        }else{
            index = 1;
        }

        radius1.setText("<html>"+dataQueri[index][0]+"</html>");
        radius2.setText("<html>"+dataQueri[index][1]+"</html>");

        ButtonGroup groupRadius = new ButtonGroup();
        groupRadius.add(radius1);
        groupRadius.add(radius2);

        this.JpanelQueri.add(radius1);
        this.JpanelQueri.add(radius2);

        // ButtonGroup groupButtons = new ButtonGroup();
        // for(String item:dataQueri[index]){
        //     JRadioButton button = new JRadioButton(item);
        //     groupButtons.add(button);
        //     this.JpanelQueri.add(button);
        // }
        JButton buttonExecute = new JButton("Ejecutar");
        buttonExecute.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                showResults();
            }
        });

        this.JpanelQueri.add(buttonExecute);

        this.setVisible(false);
        this.setVisible(true);
    }

    public void showResults(){
        if(radius1.isSelected()){
            switch (OpcionQueri) {
                case "Proyecto":
                    this.panelResults.showTable1();
                    this.setVisible(false);
                    this.setVisible(true);
                    break;
                case "Cliente":
                    this.panelResults.showTable2();
                    this.setVisible(false);
                    this.setVisible(true);
                    break;
            
                default:
                    break;
            }
        }else if(radius2.isSelected()){
            switch (OpcionQueri) {
                case "Proyecto":
                    this.panelResults.showTable3();
                    this.setVisible(false);
                    this.setVisible(true);
                    break;
                case "Cliente":
                    this.panelResults.showTable3();
                    this.setVisible(false);
                    this.setVisible(true);
                    break;
            
                default:
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(c, "Porfavor seleccione una opcion.","Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
