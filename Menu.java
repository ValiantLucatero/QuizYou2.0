/* Nombre: Jose Andres Lucatero Tenorio
*  Descripcion: Juego basado en preguntas para reafirmar conocimientos
*  Fecha: 7-1-17
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

  public class Menu extends JFrame implements ActionListener
  {
     private JLabel subtitulo;
	   private JButton historia, otc, fisica, salir;

     public static void main(String args[])
     {
       new Menu ();// llamo la clase
		 }

     public Menu()
     {
       this.setLayout(null);
       this.setSize(330,130); //tamaño de ventana
       this.setTitle("QuizYou"); //título de la ventana
       this.setVisible(true);
       this.setResizable(true);
       this.setLocationRelativeTo(null);//centra la ventana
       this.getContentPane().setBackground(Color.red);//le da color a la ventana

              subtitulo = new JLabel("Elige un tema");
              add(subtitulo);
              subtitulo.setBounds(120,0,100,30);

              historia = new JButton("Historia");
              add(historia);
              historia.setBounds(0, 40, 90, 20);
              historia.addActionListener(this);

              otc = new JButton("Programacion");
              add(otc);
              otc.setBounds(100, 40, 132, 20);
              otc.addActionListener(this);

              fisica = new JButton("Fisica");
              add(fisica);
              fisica.setBounds(240, 40, 90, 20);
              fisica.addActionListener(this);

              salir = new JButton("Salir");
              add(salir);
              salir.setBounds(120,80, 90, 20);
              salir.addActionListener(this);

	   }

	   public void actionPerformed(ActionEvent event)
     {
       if (event.getSource() == historia)
       {
         new Historia();
       }
       if (event.getSource() == otc)
       {
         new Programacion();
       }
       if (event.getSource() == fisica)
       {
         new Fisica();
       }
       if (event.getSource() == salir)
       {
         dispose(); //destruye la ventana
       }
     }
  }
