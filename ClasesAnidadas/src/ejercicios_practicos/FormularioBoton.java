package ejercicios_practicos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioBoton  extends JFrame {

    private JButton boton1;

    public FormularioBoton() {
        setLayout(null);
        boton1 = new JButton("0");
        boton1.setBounds(40, 20, 100, 50);
        add(boton1);
        //Clase anónima new ActionListener()
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int valor = Integer.parseInt(boton1.getText());
                valor++;
                boton1.setText(String.valueOf(valor));
            }
        });
    }
}
