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
        colocarCasillasVerificacion();
       
    }

    //aqui interruptor de layout
    private void colocarPaneles() {
        panel.setLayout(null);
        panel.setBackground(Color.white);
        getContentPane().add(panel);
    }

    private void colocarCasillasVerificacion() {

//189 Casillas verificacion: Marcar varios botones a la vez JCheckBox
        System.out.println("Ingrese una opcion");
        JCheckBox casillaVerificacion1 = new JCheckBox("Opcion 1", true);//constructor con opcion de checkear
        casillaVerificacion1.setEnabled(false);//habililar 
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        panel.add(casillaVerificacion1);

        JCheckBox casillaVerificacion2 = new JCheckBox("Opcion 2");
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);

        JCheckBox casillaVerificacion3 = new JCheckBox("Opcion 3");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);

        JCheckBox casillaVerificacion4 = new JCheckBox("Opcion 4");
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);
    }
