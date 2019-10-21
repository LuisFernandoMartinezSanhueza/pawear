
public class Ventana  extends JFrame{

    public Ventana(){//constructor
        
        setSize(400, 400); //establecer tamaño, ancho largo
        setLocation(450, 200);  //centrar o mover de la esquina izquierda la ventana            

        //Exit and close--EASYFOOD
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierre de programa con cerrar ventana
        //Titulo Ventana
        setTitle("EASY FOOD");
              
        //utiliza el setSize y setLocation
        setBounds(450, 200, 500, 500);
       setLocationRelativeTo(null);//establece la ventana en el centro de la pantalla
        
    }
        
    

}
