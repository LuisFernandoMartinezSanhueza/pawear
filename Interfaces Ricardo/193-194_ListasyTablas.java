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
        colocarTablas();
        colocarListas();
       
    }

    //aqui interruptor de layout
    private void colocarPaneles() {
        panel.setLayout(null);
        panel.setBackground(Color.white);
        getContentPane().add(panel);
    }
    
     private void colocarTablas() {
//193-Tablas
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Comida");//colocarColumnas
        modelo.addColumn("Precio");
        modelo.addColumn("Codigo");//necesita barra desplazamiento para motrar

        String[] comida1 = {"Churrasco", "$2500", "335"};
        String[] comida2 = {"Lomito", "$3000", "345"};
        String[] comida3 = {"Cazuela", "$2500", "355"};

        modelo.addRow(comida1);
        modelo.addRow(comida2);
        modelo.addRow(comida3);

        JTable tabla1 = new JTable(modelo);
        tabla1.setBounds(20, 20, 300, 200);
        panel.add(tabla1);

        JScrollPane barra = new JScrollPane(tabla1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(20, 20, 300, 200);
        panel.add(barra);
    }

    private void colocarListas() {
//194-Listas: siempre están presente 

        //crear objeto
        DefaultListModel modelo = new DefaultListModel();
        
        modelo.addElement(new Persona("Churrasco", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco1", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco2", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco3", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco4", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco5", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco6", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco7", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco8", 2500, "Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco9", 2500, "Italiano")); //ingresar objeto  modelo.addElement(new Persona("Churrasco",2500,"Italiano")); //ingresar objeto
        modelo.addElement(new Persona("Churrasco10", 2500, "Italiano")); //ingresar objeto
        //si se selecciona un elemtento de la lista se selecciona el objeto
        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 300, 300);
        panel.add(lista);
        
        JScrollPane barra = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        barra.setBounds(20,20,300,300);
        panel.add(barra);
    }
}
