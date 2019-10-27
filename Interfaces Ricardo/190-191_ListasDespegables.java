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
       colocarListasDespegables();
       
    }

    //aqui interruptor de layout
    private void colocarPaneles() {
        panel.setLayout(null);
        panel.setBackground(Color.white);
        getContentPane().add(panel);
    }

   


    private void colocarListasDespegables() {

        //190 Listas despegables JComboBox
        String[] comidas = {"Churrasco", "Completo", "Lomo a lo pobre", "Chorrillana", "Seleccione una comida"};
        JComboBox listaDespegable1 = new JComboBox(comidas);
        listaDespegable1.setBounds(20, 20, 100, 30);
//    panel.add(listaDespegable1);

        listaDespegable1.addItem("Sopa");//agrega objetos luego de la creacion
        listaDespegable1.setSelectedItem("Seleccione una comida");//Selecciona el objeto como primero en la lista

//191 Usar modelos DefaultComboBoxModel
        //creacion de clase Persona 
        
        Persona persona1 = new Persona("Tomas",23,"Peruano");
        Persona persona0 = new Persona("Busque la persona",0,"mundo");
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDespegable2 = new JComboBox(modelo);
        
        modelo.addElement(persona0);
        modelo.addElement(persona1);
        
        listaDespegable2.setBounds(100, 20, 200, 30);
        panel.add(listaDespegable2);
        
        
    }
}
