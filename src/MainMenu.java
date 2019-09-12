import javax.swing.*;

public class MainMenu {
    private JButton button1;
    private JPanel panelMain;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ping Tester");
        ImageIcon img = new ImageIcon("./assets/icon.jpg");//Dirección del icono de la ventana con dirección relativa
        frame.setIconImage(img.getImage()); //Poniendo la imagen de icono
        frame.setContentPane(new MainMenu().panelMain); //Haciendo que el panel se una a la ventana como contenido
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Si le damos a la cruz la aplicación se cierra
        frame.pack(); //TODO Buscar que signficica esta línea
        frame.setVisible(true); //Hacer que la ventana sea visible
    }
    public void buttonClickTest(){
        System.out.println("Testing button");
    }
}

