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

     public static void main(String args[])
     {
       new LogIn ();// llamo la clase
		 }

     public LogIn()
     {
       this.setLayout(null);
       this.setSize(110,50); //tamaño de ventana
       this.setTitle("QuizYou"); //título de la ventana
       this.setVisible(true);
       this.setResizable(true);
       this.setLocationRelativeTo(null);//centra la ventana
       this.getContentPane().setBackground(new Color(42,114,138));//le da color a la ventana

              boton = new JButton("Jugar");
              add(boton);
              boton.setBounds(0, 0, 110, 25);
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
          new Menu (); //va a la clase principal
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Password incorrecta");
        }
     }
}
