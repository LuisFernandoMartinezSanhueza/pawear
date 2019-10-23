
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

}
