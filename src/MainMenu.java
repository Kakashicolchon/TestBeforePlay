import javax.swing.*;
import java.awt.*;

public class MainMenu {
    private JButton button1;
    private JPanel panelMain;
    private JLabel title;

    private MainMenu() {
        button1.addActionListener(e -> System.out.println("TEsting botón"));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ping Tester"); //Primero creamos un objeto tipo Java Frame, una ventana nueva y le damos un título
        frame.setLocationRelativeTo(null);//centramos la ventana
        ImageIcon img = new ImageIcon("./assets/icon.jpg");//Dirección del icono de la ventana con dirección relativa
        frame.setIconImage(img.getImage()); //Poniendo la imagen de icono
        frame.setContentPane(new MainMenu().panelMain); //Haciendo que el panel se una a la ventana como contenido
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Si le damos a la cruz la aplicación se cierra
        frame.pack(); //TODO Buscar que signficica esta línea
        frame.setVisible(true); //Hacer que la ventana sea visible

        JLabel title = new JLabel();
        TitleObject titleObject = new TitleObject("asdas", title);
        //TODO hacer el settext del título
    }

    //--------------------------------METHODS-------------------------------------

}

