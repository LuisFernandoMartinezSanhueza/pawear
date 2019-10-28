
public class Ventana2 extends JFrame {

    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;

    public Ventana2() {
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        setLocationRelativeTo(null);
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {

        colocarPanel();
        //colocarEtiqueta();
        //colocarCajaTexto();
        colocarBoton();
        colocarAreaTexto();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        
        //199-Rueda raton
        eventoRuedaRaton();//se le puede poner el evento en cualquier, boton, panel,contenedor
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("Ingrese su nombre");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("arial", Font.BOLD, 10));
        panel.add(etiqueta);
    }

    private void colocarCajaTexto() {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 300);
        panel.add(cajaTexto);
    }

    private void colocarAreaTexto() {
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
    }

    //Aqui los oyentes
    private void colocarBoton() {
        boton = new JButton("Pulsa aquí");
        boton.setBounds(300, 340, 100, 80);
        boton.setFont(new Font("arial", Font.BOLD, 15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial", Font.BOLD, 10));
        panel.add(saludo);//se utilizó como una variable global
        //195-Oyente de accion
        //eventoOyenteAccion();
        //196-Oyente de raton
        //eventoOyenteRaton();
    }

    private void eventoOyenteAccion() {
        //195-Agregando el oyente de accion ActionListener
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //este metodo es abstracto
                saludo.setText("Hola " + cajaTexto.getText());//Funcion que utiliza el boton
            }
        };
        boton.addActionListener(oyente);
    }

    private void eventoOyenteRaton() {
        //196-Agregando oyente de raton

        MouseListener oyenteRaton = new MouseListener() {

            //197-Metodos de los eventos del raton -> https://docs.oracle.com/javase/7/docs/api/
            @Override
            public void mouseClicked(MouseEvent e) {//click y soltar en el boton
                //areaTexto.append("Mouse\n");//append porque setText da error
                if (e.isAltDown()) { //se refiere a que si se utiliza la tecla alt
                    areaTexto.append("Alt");
                }
                if (e.isControlDown())//se refiere a que si utilzia la tecla Ctrl
                {
                    areaTexto.append("Ctrl");
                }
                if(e.isShiftDown()){//se refiere a que su utiliza la letra Shift
                    areaTexto.append("Shift");
                }
                if(e.isMetaDown()){//se refiere si se utilza click derecho
                    areaTexto.append("Click Derecho\n");
                }else{
                    areaTexto.append("Click Izquierdo");
                }
                
                if(e.getClickCount() == 2){//cuenta los  doble click
                    areaTexto.append("\nDoble click");
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {//cuando apenas se la da click
                //areaTexto.append("Mouse pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {//se puede presionar adentro y soltar afuera
                //areaTexto.append("MouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {//solamente entrar en el boton
                //areaTexto.append("MouseEntered\n");  
            }

            @Override
            public void mouseExited(MouseEvent e) {//solamente luego de salir del boton
                areaTexto.append("MouseExited\n");
            }
        };

        boton.addMouseListener(oyenteRaton);//añadiendo funcion
    }
    
    private void eventoRuedaRaton(){
        //199-Movimiento de la rueda del raton
        MouseWheelListener rueda = new MouseWheelListener() {
            @Override//metodos abstractos
            public void mouseWheelMoved(MouseWheelEvent e) {//erifica el movimiento del raton
                if(e.getPreciseWheelRotation()  == 2){
                    areaTexto.append("Rueda hacia arriba\n");
                }else if(e.getPreciseWheelRotation() == 2){//o otro numero
                    areaTexto.append("Rueda hacia abajo\n");
                } 
                
            }
        };
     
        panel.addMouseWheelListener(rueda);//controlamos la acciones del movimiento de la rueda del raton
    }

}

public class Ventana2 extends JFrame {

    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;

    public Ventana2() {
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        setLocationRelativeTo(null);
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {

        colocarPanel();
        //colocarEtiqueta();
        //colocarCajaTexto();
        colocarBoton();
        colocarAreaTexto();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        
        //199-Rueda raton
        eventoRuedaRaton();//se le puede poner el evento en cualquier, boton, panel,contenedor
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("Ingrese su nombre");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("arial", Font.BOLD, 10));
        panel.add(etiqueta);
    }

    private void colocarCajaTexto() {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 300);
        panel.add(cajaTexto);
    }

    private void colocarAreaTexto() {
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
    }

    //Aqui los oyentes
    private void colocarBoton() {
        boton = new JButton("Pulsa aquí");
        boton.setBounds(300, 340, 100, 80);
        boton.setFont(new Font("arial", Font.BOLD, 15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial", Font.BOLD, 10));
        panel.add(saludo);//se utilizó como una variable global
        //195-Oyente de accion
        //eventoOyenteAccion();
        //196-Oyente de raton
        //eventoOyenteRaton();
    }

    private void eventoOyenteAccion() {
        //195-Agregando el oyente de accion ActionListener
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //este metodo es abstracto
                saludo.setText("Hola " + cajaTexto.getText());//Funcion que utiliza el boton
            }
        };
        boton.addActionListener(oyente);
    }

    private void eventoOyenteRaton() {
        //196-Agregando oyente de raton

        MouseListener oyenteRaton = new MouseListener() {

            //197-Metodos de los eventos del raton -> https://docs.oracle.com/javase/7/docs/api/
            @Override
            public void mouseClicked(MouseEvent e) {//click y soltar en el boton
                //areaTexto.append("Mouse\n");//append porque setText da error
                if (e.isAltDown()) { //se refiere a que si se utiliza la tecla alt
                    areaTexto.append("Alt");
                }
                if (e.isControlDown())//se refiere a que si utilzia la tecla Ctrl
                {
                    areaTexto.append("Ctrl");
                }
                if(e.isShiftDown()){//se refiere a que su utiliza la letra Shift
                    areaTexto.append("Shift");
                }
                if(e.isMetaDown()){//se refiere si se utilza click derecho
                    areaTexto.append("Click Derecho\n");
                }else{
                    areaTexto.append("Click Izquierdo");
                }
                
                if(e.getClickCount() == 2){//cuenta los  doble click
                    areaTexto.append("\nDoble click");
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {//cuando apenas se la da click
                //areaTexto.append("Mouse pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {//se puede presionar adentro y soltar afuera
                //areaTexto.append("MouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {//solamente entrar en el boton
                //areaTexto.append("MouseEntered\n");  
            }

            @Override
            public void mouseExited(MouseEvent e) {//solamente luego de salir del boton
                areaTexto.append("MouseExited\n");
            }
        };

        boton.addMouseListener(oyenteRaton);//añadiendo funcion
    }
    
    private void eventoRuedaRaton(){
        //199-Movimiento de la rueda del raton
        MouseWheelListener rueda = new MouseWheelListener() {
            @Override//metodos abstractos
            public void mouseWheelMoved(MouseWheelEvent e) {//erifica el movimiento del raton
                if(e.getPreciseWheelRotation()  == 2){
                    areaTexto.append("Rueda hacia arriba\n");
                }else if(e.getPreciseWheelRotation() == 2){//o otro numero
                    areaTexto.append("Rueda hacia abajo\n");
                } 
                
            }
        };
     
        panel.addMouseWheelListener(rueda);//controlamos la acciones del movimiento de la rueda del raton
    }

}
