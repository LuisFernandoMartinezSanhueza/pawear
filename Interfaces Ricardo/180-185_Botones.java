
public class Ventana extends JFrame {

    JPanel panel = new JPanel(); // instanciar aca

    public Ventana() {
        setTitle("EASY FOOD");
        setBounds(0, 0, 500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        getContentPane().setBackground(Color.green);

        iniciarComponentes();
    }

    private void iniciarComponentes() {

        colocarPaneles(); 
        colocarBotones();
    }


 //180 Crea boton
    private void colocarBotones() {
        JButton boton1 = new JButton("Click");//constructor1 o 
                                    //BOTON 2 TEXTO
        JButton boton2 = new JButton(); // constructor2
         panel.add(boton2);
        boton2.setBounds(100, 100, 100, 40);
        boton2.setText("Click");
        boton2.setEnabled(true); //establece la interaccion del boton
        boton2.setMnemonic('a'); //establece un vinculo Alt + char para utilizar el boton
       
        panel.add(boton2);
        
//181 Editar el boton
        boton2.setForeground(Color.BLACK);//color de la letra del boton
        boton2.setFont(new Font("cooper black",Font.ITALIC,15));//Fuente de la letra
        
//182 Boton de imagen
        JButton boton3 = new JButton();//contructor
       boton3.setBounds(100,200,100,40);
         panel.add(boton3);
        //boton3.setOpaque(true);//Por si el color no cambia, da el permiso para cambiar el color del boton
        ImageIcon botonImagen = new ImageIcon("178-Creeper.jpg");
        
        boton3.setIcon(new ImageIcon(botonImagen.getImage(). //agregamos imagen y redimencionamos
                getScaledInstance(boton3.getWidth(), boton3.getHeight(),Image.SCALE_SMOOTH)));
        
        boton3.setBackground(Color.green);
        
 //183 Borde en botones
        JButton boton4 = new JButton();//constructor
        boton4.setBounds(100,300,110,50);
        panel.add(boton4);

        boton4.setBorder(BorderFactory.createLineBorder(Color.yellow, 2, true));//Border es una interface, el entero es el numero de pixeles
        
    }
    
      private void colocarRadioBotones() {

 //184-Crear RadioBotones
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);//Contructor x
        radioBoton1.setBounds(50, 100, 100, 50);
        radioBoton1.setEnabled(false);//permite la seleccion del boton
        radioBoton1.setText("Proga");
        radioBoton1.setFont(new Font("Proga", Font.BOLD, 20)); // editar el texto dentro de los botones
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();//crear un grupo de radiobotones para que solo marque solo una opcion
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);

    }

    private void colocarBotonesActivacion() {

  //185 Botones de activacion
        JToggleButton botonActivacion1 = new JToggleButton("Opcion 1", true);//se activan con true
        botonActivacion1.setBounds(50, 100, 100, 50);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("Opcion 1", false);//se activan con true
        botonActivacion2.setBounds(50, 200, 100, 50);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("Opcion 1", false);//se activan con true
        botonActivacion3.setBounds(50, 300, 100, 50);
        panel.add(botonActivacion3);

        ButtonGroup grupoBotonesActivado = new ButtonGroup();
        grupoBotonesActivado.add(botonActivacion1);
        grupoBotonesActivado.add(botonActivacion2);
        grupoBotonesActivado.add(botonActivacion3);
    }
    

}
