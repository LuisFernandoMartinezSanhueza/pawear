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
      
        colocarCajasTexto();
      colocarAreasTexto();
      
        
    }

    //aqui interruptor de layout
    private void colocarPaneles() {
       panel.setLayout(null);
        panel.setBackground(Color.white);
        getContentPane().add(panel);
    }
    
    private void colocarCajasTexto(){
   //186-Crear caja de texto
        JTextField cajaTexto = new JTextField();//contructor1
        cajaTexto.setBounds(50,50,400,20);
        panel.add(cajaTexto);
        
        cajaTexto.setText("shiaa");//pasamos el texto
        System.out.println("Texto en la caja "+cajaTexto.getText());
        cajaTexto.setColumns(20);//establece las columnas en la caja
 }
    
    private void colocarAreasTexto(){

//187 Area de texto
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20, 300, 200);
        panel.add(areaTexto);
        
        areaTexto.setText("Escriba el texto aqui...");//escribe un por defecto
        areaTexto.append("\nEscribe por aqui");//añade mas texto al area por defecto
        areaTexto.setEditable(true);//Permite editar todo el texto
        
        
//188 Barra desplazamiento
        JScrollPane barrasDesplazamiento =  new JScrollPane(areaTexto);//Constructor 
        barrasDesplazamiento.setBounds(20,20,300,300);
        panel.add(barrasDesplazamiento);
        
        barrasDesplazamiento.setVerticalScrollBarPolicy
        (ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
         //barras de desplazamiento segun constante copiada de predic de police
         
       barrasDesplazamiento.setHorizontalScrollBarPolicy
        (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
 
       
      }
        
    }
