public class Ventana extends JFrame {

    public Ventana() {
        setTitle("EASY FOOD");
        setBounds(0, 0, 500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));
        getContentPane().setBackground(Color.green); //Es el color de la ventana
        
        
        //Llamado a Panel
        iniciarComponentes();
    }

    // 173  Creacion de PANEL
    private void iniciarComponentes() {//constructor
        JPanel panel = new JPanel();
        panel.setLayout(null); // desactiva el diseño del panel para poder editarlo
        panel.setBackground(Color.BLACK);//color del panel, esobrescribe el color de la ventana
        getContentPane().add(panel); // se agrega el panel a la ventana
        
 //174 Creacion de etiquetas: texto  
        JLabel etiqueta1= new JLabel(); //contructor simple o
        etiqueta1.setText("HOLA");
        
        JLabel etiqueta2 = new JLabel("CREEPER"); //constructor texto
        etiqueta2.setBounds(40, 40, 100, 70); //establecer la etiqueta, se necesita desactivar
        panel.setLayout(null); // desactiva el diseño del panel para poder editarlo
        //agregar la etiqueta al panel
        panel.add(etiqueta2);
        
//175 Cambiar el color de la letra y el fondo
        etiqueta2.setForeground(Color.white);//color de la letra
        etiqueta2.setBackground(Color.green);//color del fondo,se neciesita cambiar diseño por defecto del panel
        etiqueta2.setOpaque(true);//permite pintar el fondo de la eiqueta por defecto

//176 Cambiar la ubicacion del texto dentro de la etiqueta
         etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);

//177 Cambiar la fuente del texto
         etiqueta2.setFont(new Font("arial",Font.BOLD,18));//fuente, 3x1

//178 Agregar etiqueta tipo imagen
         JLabel imagen1 = new JLabel(new ImageIcon("178-Creeper.jpg"));//Manera1: agrega la imagen dentro de la carpeta
       
         ImageIcon imagenAux = new ImageIcon("178-Creeper.jpg");//Manera2
         JLabel imagen2 = new JLabel(imagenAux);//Manera2
         
         JLabel imagen3 = new JLabel();//Manera3
         imagen3.setIcon(new ImageIcon("178-Creeper.jpg"));//Manera3
         
         imagen3.setBounds(0, 0, 900, 900);//especifica la etiqueta no imagen
         
         //panel.add(imagen3);

//179 Cambiar el tamaño de la imagen
        ImageIcon imagenCambiar = new ImageIcon("178-Creeper.jpg");
        JLabel  etiqueta3 = new JLabel();
        etiqueta3.setBounds(80, 90,300, 300);
        etiqueta3.setIcon(new ImageIcon(imagenCambiar.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH) )); // el sMooth es clavee
                                                                //obtenerImagen para esclarla, con su largo
        panel.add(etiqueta3);
    }
