/* Nombre: Jose Andres Lucatero Tenorio
*  Descripcion: Juego basado en preguntas para reafirmar conocimientos
*  Fecha: 7-1-17
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//import javax.swing.JScrollBar;


  public class Fisica extends JFrame implements ActionListener
  {
    private JLabel etiquetaBienvenida, p1, p3, p4, p5, p6, p7, p8, p9;
    private JRadioButton r1, rUno, r3, rTres, r4, rCuatro, r5, rCinco, r6, rSeis, r7, rSiete, r9, rNueve;
    private JCheckBox r8, rOcho;
    private JButton botonEnviar, botonCerrar, botonLimpiar;
  	private ButtonGroup g1, g3, g4, g5, g6, g7, g9;
    //private JScrollBar vbar;

    public static void main(String args[])
    {
        new Fisica();
    }

    public Fisica()
    {
        //vbar = new JScrollBar(JScrollBar.VERTICAL,30,40,0,500);
        //this.getContentPane().add(vbar, BorderLayout.EAST);

        setLayout(null);
        this.setSize(450,550); //tamaño de la ventana
        this.setTitle("Historia"); //título de la ventana
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);//centra la ventana
        this.getContentPane().setBackground(new Color(42,114,138));//le da color a la ventana

        etiquetaBienvenida = new JLabel("Responde:");
        this.add(etiquetaBienvenida);
        etiquetaBienvenida.setBounds(0,0,80,20);

        //Pregunta 1
        p1 = new JLabel("1.- Hay 4 leyes de Newton");
        this.add(p1);
        p1.setBounds(0,20,400,20);

	  	g1 = new ButtonGroup();

        r1 = new JRadioButton("Verdadero");
        this.add(r1);
        g1.add(r1);
        r1.setBounds(0,40,100,20);
        r1.setBackground(new Color(42,114,138));

        rUno = new JRadioButton("Falso");
		    this.add(rUno);
		    g1.add(rUno);
        rUno.setBounds(120,40,65,20);
        rUno.setBackground(new Color(42,114,138));

		//Pregunta 3
        p3 = new JLabel("2.- La masa es una propiedad intensiva");
        this.add(p3);
        p3.setBounds(0,60,430,20);

		g3 = new ButtonGroup();

        r3 = new JRadioButton("Verdadero");
        this.add(r3);
		    g3.add(r3);
        r3.setBounds(0,80,100,20);
        r3.setBackground(new Color(42,114,138));

        rTres = new JRadioButton("Falso");
		    this.add(rTres);
		    g3.add(rTres);
        rTres.setBounds(120,80,65,20);
        rTres.setBackground(new Color(42,114,138));

		//Pregunta 4
        p4 = new JLabel("3.- Hay 5 estados del agua");
        this.add(p4);
        p4.setBounds(0,100,230,20);

		g4 = new ButtonGroup();

        r4 = new JRadioButton("Verdadero");
        this.add(r4);
		    g4.add(r4);
        r4.setBounds(0,120,100,20);
        r4.setBackground(new Color(42,114,138));

        rCuatro = new JRadioButton("Falso");
		    this.add(rCuatro);
		    g4.add(rCuatro);
        rCuatro.setBounds(120,120,65,20);
        rCuatro.setBackground(new Color(42,114,138));

		//Pregunta 5
        p5 = new JLabel("4.- El oro no es ferromagnetico");
        this.add(p5);
        p5.setBounds(0,140,400,20);

		g5 = new ButtonGroup();

        r5 = new JRadioButton("Verdadero");
        this.add(r5);
		    g5.add(r5);
        r5.setBounds(0,160,100,20);
        r5.setBackground(new Color(42,114,138));

        rCinco = new JRadioButton("Falso");
		    this.add(rCinco);
		    g5.add(rCinco);
        rCinco.setBounds(120,160,65,20);
        rCinco.setBackground(new Color(42,114,138));

		//Pregunta 6
        p6 = new JLabel("5.- Tienes la misma masa en La Luna");
        this.add(p6);
        p6.setBounds(0,180,400,20);

		g6 = new ButtonGroup();

        r6 = new JRadioButton("Verdadero");
        this.add(r6);
		    g6.add(r6);
        r6.setBounds(0,200,100,20);
        r6.setBackground(new Color(42,114,138));

        rSeis = new JRadioButton("Falso");
		    this.add(rSeis);
		    g6.add(rSeis);
        rSeis.setBounds(120,200,65,20);
        rSeis.setBackground(new Color(42,114,138));

		//Pregunta 7
        p7 = new JLabel("6.- La Luna se esta alejando");
        this.add(p7);
        p7.setBounds(0,220,400,20);

		g7 = new ButtonGroup();

        r7 = new JRadioButton("Verdadero");
        this.add(r7);
		    g7.add(r7);
        r7.setBounds(0,240,100,20);
        r7.setBackground(new Color(42,114,138));

        rSiete = new JRadioButton("Falso");
		    this.add(rSiete);
		    g7.add(rSiete);
        rSiete.setBounds(120,240,65,20);
        rSiete.setBackground(new Color(42,114,138));

		//Pregunta 8
        p8 = new JLabel("7.- Selecciona al vector");
        this.add(p8);
        p8.setBounds(0,260,400,20);

        r8 = new JCheckBox();
        this.add(r8);
        r8.setBounds(90,380,20,20);
        r8.setBackground(new Color(42,114,138));

        int width = 200;
        int height = 100;
        ImageIcon img1 = new ImageIcon(new ImageIcon("img5.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        JLabel imgUno = new JLabel(img1);
        this.add(imgUno);
        imgUno.setBounds(0,280,200,100);

        rOcho = new JCheckBox();
        this.add(rOcho);
        rOcho.setBounds(300,380,20,20);
        rOcho.setBackground(new Color(42,114,138));

        ImageIcon img2 = new ImageIcon(new ImageIcon("img6.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        JLabel imgDos = new JLabel(img2);
        this.add(imgDos);
        imgDos.setBounds(210,280,200,100);


		//Pregunta 9
        p9 = new JLabel("8.- La electricidad y el magnetismo estan ligados");
        this.add(p9);
        p9.setBounds(0,400,450,20);

		g9 = new ButtonGroup();

        r9 = new JRadioButton("Verdadero");
        this.add(r9);
		    g9.add(r9);
        r9.setBounds(0,420,100,20);
        r9.setBackground(new Color(42,114,138));

        rNueve = new JRadioButton("Falso");
		    this.add(rNueve);
		    g9.add(rNueve);
        rNueve.setBounds(120,420,65,20);
        rNueve.setBackground(new Color(42,114,138));

        //Botones
        botonEnviar = new JButton("Revisar");
        this.add(botonEnviar);
        botonEnviar.setBounds(200, 450, 90, 20);
        botonEnviar.addActionListener(this);

        botonCerrar = new JButton("Salir");
        this.add(botonCerrar);
        botonCerrar.setBounds(210, 470, 70, 20);
        botonCerrar.addActionListener(this);

		    botonLimpiar = new JButton("Limpiar");
        this.add(botonLimpiar);
        botonLimpiar.setBounds(200, 490, 90, 20);
        botonLimpiar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {
    	Object origen= event.getSource(); //permite trabajar con mas de un botón
      int contador;
      contador=8;
      ArrayList<String> list = new ArrayList<String>();
    	if (origen == botonEnviar)
    	{
           if (!(rUno.isSelected()))
           {
             contador--;
             list.add("1");
           }
           if (!(rTres.isSelected()))
           {
             contador--;
             list.add("2");
           }
           if (!(r4.isSelected()))
           {
             contador--;
             list.add("3");
           }
           if (!(r5.isSelected()))
           {
             contador--;
             list.add("4");
           }
           if (!(r6.isSelected()))
           {
             contador--;
             list.add("5");
           }
           if (!(r7.isSelected()))
           {
             contador--;
             list.add("6");
           }
           if (!(r8.isSelected()))
           {
             contador--;
             list.add("7");
           }
           if (!(r9.isSelected()))
           {
             contador--;
             list.add("8");
           }
           JOptionPane.showMessageDialog(null,"Tu puntaje fue de:"+contador+"\nTus errores:"+list);
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
