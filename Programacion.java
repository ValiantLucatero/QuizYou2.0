/* Nombre: Jose Andres Lucatero Tenorio
*  Descripcion: Juego basado en preguntas para reafirmar conocimientos
*  Fecha: 7-1-17
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

  public class Programacion extends JFrame implements ActionListener
  {
    private JLabel etiquetaBienvenida, p1, p3, p4, p5, p6, p7, p8, p9;
    private JRadioButton r1, rUno, r3, rTres, r4, rCuatro, r5, rCinco, r6, rSeis, r7, rSiete, r9, rNueve;
    private JCheckBox r8, rOcho;
    private JButton botonEnviar, botonCerrar, botonLimpiar;
  	private ButtonGroup g1, g3, g4, g5, g6, g7, g9;

    public static void main(String args[])
    {
        new Programacion();
    }

    public Programacion()
    {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(480,740); //tamaño de la ventana
        this.setTitle("Programacion"); //título de la ventana
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);//centra la ventana
        this.getContentPane().setBackground(Color.red);//le da color a la ventana

        etiquetaBienvenida = new JLabel("Responde si o no segun consideres:");
        this.add(etiquetaBienvenida);

        //Pregunta 1
        p1 = new JLabel("¿Estas al tanto de las elecciones en EUA?");
        this.add(p1);

	  	g1 = new ButtonGroup();

        r1 = new JRadioButton("Si");
        this.add(r1);
        g1.add(r1);

        rUno = new JRadioButton("No");
		    this.add(rUno);
		    g1.add(rUno);

		//Pregunta 3
        p3 = new JLabel("¿Estas conforme con el resultado?");
        this.add(p3);

		g3 = new ButtonGroup();

        r3 = new JRadioButton("Si");
        this.add(r3);
		g3.add(r3);

        rTres = new JRadioButton("No");
		this.add(rTres);
		g3.add(rTres);

		//Pregunta 4
        p4 = new JLabel("¿Tienes familiares en EUA?");
        this.add(p4);

		g4 = new ButtonGroup();

        r4 = new JRadioButton("Si");
        this.add(r4);
		g4.add(r4);

        rCuatro = new JRadioButton("No");
		this.add(rCuatro);
		g4.add(rCuatro);

		//Pregunta 5
        p5 = new JLabel("¿Crees que Trump tiene la capacidad de dirigir un pais tan poderoso?");
        this.add(p5);

		g5 = new ButtonGroup();

        r5 = new JRadioButton("Si");
        this.add(r5);
		g5.add(r5);

        rCinco = new JRadioButton("No");
		this.add(rCinco);
		g5.add(rCinco);

		//Pregunta 6
        p6 = new JLabel("¿Crees que Trump esta en lo corecto con su politica migratoria?");
        this.add(p6);

		g6 = new ButtonGroup();

        r6 = new JRadioButton("Si");
        this.add(r6);
		g6.add(r6);

        rSeis = new JRadioButton("No");
		this.add(rSeis);
		g6.add(rSeis);

		//Pregunta 7
        p7 = new JLabel("¿Has viajado a EUA?");
        this.add(p7);

		g7 = new ButtonGroup();

        r7 = new JRadioButton("Si");
        this.add(r7);
		g7.add(r7);

        rSiete = new JRadioButton("No");
		this.add(rSiete);
		g7.add(rSiete);

		//Pregunta 8
        p8 = new JLabel("Tu...");
        this.add(p8);

        r8 = new JCheckBox("¿Estas en un partido politico?");
        this.add(r8);

        rOcho = new JCheckBox("¿Consideras que sabes de politica?");
		this.add(rOcho);

		//Pregunta 9
        p9 = new JLabel("¿Ayudaras con el muro?");
        this.add(p9);

		g9 = new ButtonGroup();

        r9 = new JRadioButton("Si");
        this.add(r9);
		g9.add(r9);

        rNueve = new JRadioButton("No");
		this.add(rNueve);
		g9.add(rNueve);

        botonEnviar = new JButton("Enviar");
		    botonEnviar.setAlignmentX(CENTER_ALIGNMENT);
        this.add(botonEnviar);
        botonEnviar.setBounds(2, 20, 30, 30);
        botonEnviar.addActionListener(this);

        botonCerrar = new JButton("Salir");
        botonCerrar.setAlignmentX(CENTER_ALIGNMENT);
        botonCerrar.setBounds(2, 50, 30, 30);
        this.add(botonCerrar);
        botonCerrar.addActionListener(this);

		    botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setAlignmentX(CENTER_ALIGNMENT);
        botonLimpiar.setBounds(2, 50, 50, 30);
        this.add(botonLimpiar);
        botonLimpiar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {
    	Object origen= event.getSource(); //permite trabajar con mas de un botón
    	if (origen == botonEnviar)
    	{
           if (r3.isSelected())
           {
               JOptionPane.showMessageDialog(null,"Conformista!");
           }
           else if(r4.isSelected())
           {
			   JOptionPane.showMessageDialog(null,"Deseales suerte a tus familiares");
		   }
			  else
              {
				JOptionPane.showMessageDialog(null,"Buscas un cambio");
              }
    	}
    	else if (origen == botonCerrar)
		{
    		dispose();// Cierra el formulario

    	}
		else if (origen == botonLimpiar)
		{
			g1.clearSelection();
			g3.clearSelection();
			g4.clearSelection();
			g5.clearSelection();
			g6.clearSelection();
			g7.clearSelection();
			g9.clearSelection();
			r8.setSelected(false);
			rOcho.setSelected(false);
		}
    }
}
