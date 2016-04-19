package boletin25b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JP
 */
public class Ventana implements ActionListener {

    JFrame marco = new JFrame();
    JPanel panel = new JPanel();
    JButton dibujar = new JButton("Dibujar");
    JButton borrar = new JButton("Limpar");
    JTextField casilla = new JTextField(6);

    public void debuxar() {

        marco.setSize(600, 600);
        panel.setSize(560, 560);
        dibujar.setSize(60, 60);
        borrar.setSize(40, 40);
        casilla.setSize(60, 60);
        dibujar.addActionListener(this);
        borrar.addActionListener(this);
        panel.add(dibujar);
        panel.add(borrar);
        panel.add(casilla);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == (dibujar)) {
            int x = 0, y = 0;
            for (int i = 0; i < Integer.parseInt(casilla.getText()); i++) {
                Graphics graf = panel.getGraphics();
                graf.setColor(Color.green);
                graf.fillOval(50 + x, 50 + y, 150, 150);
                x = x + 100;
                y = y + 60;
            }
        } else {
            panel.repaint();
        }

    }
}
