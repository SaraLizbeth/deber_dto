package UserInterface.App;

import BusinessLogic.Entities.PlataformaDeMusicaBL;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import BusinessLogic.Entities.PlataformaDeMusica;
import Framework.AppException;

public class PlataformaDeMusicaMenu extends JFrame {

    private PlataformaDeMusicaBL plataformaDeMusicaBL = null;
    private PlataformaDeMusica plataformaDeMusica = null;
    private JPanel pnlTabla = new JPanel();
    
    public PlataformaDeMusicaMenu () throws AppException {
        plataformaDeMusicaBL = new PlataformaDeMusicaBL();
        setTitle("PLATAFORMA DE MUSICA");
        setGridBagLayout();
        showTable();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); 
    }

    private void showTable() throws AppException {
        String[] header = {"CATALODO DE MUSICA", "CANTANTE", "CANCION"};
        Object [][] data = new Object[plataformaDeMusicaBL.getAllData().size()][3];
        int index=0;

        for (PlataformaDeMusica pap: plataformaDeMusicaBL.getAllData()) {
            data[index][0]= pap.getCatalogoDeMusica();
            data[index][1] = pap.getCantante();
            data[index][2]= pap.getCancion();
            index++;
        }

        JTable table = new JTable(data, header);
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.PINK);
        table.setRowSelectionAllowed(true);
        table.setColumnSelectionAllowed(false);

        table.setPreferredScrollableViewportSize(new Dimension(550,250));
        table.setFillsViewportHeight(true);

        pnlTabla.removeAll();
        pnlTabla.add(table);
        JScrollPane scrollPane = new JScrollPane(table);
        pnlTabla.add(scrollPane);
    }

    public void setGridBagLayout(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy=2;        gbc.gridx=0;
        gbc.gridwidth=3;
        gbc.ipady=250;
        gbc.ipadx=750;
        pnlTabla.add(new Label("Cargando..."));
        pnlTabla.setBackground(Color.PINK);
        add(pnlTabla,gbc);
    }

    public void mostrarMenu(){
        setVisible(true); 
    }
}
