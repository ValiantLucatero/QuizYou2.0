/* Nombre: Jose Andres Lucatero Tenorio
*  Descripcion: Juego basado en preguntas para reafirmar conocimientos
*  Fecha: 29-11-16
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

  public class LogIn extends JFrame implements ActionListener
  {
	   private JButton boton;
	   private JLabel titulo;

     public static void main(String[] args)
     {
		    LogIn marco = new LogIn();
        marco.setSize(110, 100);
        marco.crearGUI();
        marco.setVisible(true);
        marco.setTitle("QuizYou");  // Permite crear el titulo del marco
        marco.getContentPane().setBackground(Color.red); // permite asignarle un color al marco
		 }

     public void crearGUI()
     {
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       Container ventana = getContentPane();
       ventana.setLayout(new FlowLayout());

       titulo = new JLabel("QuizYou");
     	 titulo.setFont(new Font("Serif", Font.BOLD, 24));
     	 ventana.add(titulo);

       boton = new JButton("Jugar");
     	 ventana.add(boton);
     	 boton.addActionListener(this);
	   }

	   public void actionPerformed(ActionEvent event)
     {
	      String contra, intro;
        contra = "password";
        intro = JOptionPane.showInputDialog(null,"Introduce password","Sistema",JOptionPane.QUESTION_MESSAGE);
        if (intro.equals(contra))
        {
          dispose(); //destruye ventana
          //new Menu; //va a la clase principal
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Password incorrecta");
        }
     }
}
