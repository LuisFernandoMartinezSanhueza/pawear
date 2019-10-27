
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
        colocarCampoContraseña();
       
    }

    //aqui interruptor de layout
    private void colocarPaneles() {
        panel.setLayout(null);
        panel.setBackground(Color.white);
        getContentPane().add(panel);
    }
 
 private void colocarCampoContraseña(){
        
//192 Campo de contraseña
        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(20, 20, 150, 50);
        panel.add(campoContraseña);
        
       campoContraseña.setText("holaaaaaaaa"); //pone contraseña manualmente
       
       String contraseña = "";
       
       for(int i = 0; i < campoContraseña.getPassword().length; i++){//recorre todo el arreglo de caracteres
           contraseña += campoContraseña.getPassword()[i];
       }
       
        System.out.println("Contraseña "+contraseña);//password devuelve char
    }
}
