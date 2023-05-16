package beans;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ColorCelda extends JTable {
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex) {
        Component componente = super.prepareRenderer(renderer, rowIndex, columnIndex);
        
        if (columnIndex == 5) {
            String valor = (String) getValueAt(rowIndex, columnIndex);
            
            if (valor.equalsIgnoreCase("completa")) {
                componente.setBackground(Color.green);
                componente.setForeground(Color.black);
                
            } else if (valor.equalsIgnoreCase("en progreso")) {
                componente.setBackground(Color.blue);
                componente.setForeground(Color.white);
                
            } else if (valor.equalsIgnoreCase("revisar")) {
                componente.setBackground(Color.orange);
                componente.setForeground(Color.black);
            } else {
                componente.setBackground(Color.gray);
                componente.setForeground(Color.white);
            }
        } else {
            componente.setBackground(Color.white);
            componente.setForeground(Color.black);
        }
        return componente;
    }
}
