
import javax.swing.JFrame;

public class Inne extends JFrame{

    Inne(){

        this.add(new Kod());
        this.setTitle("Wąż Rzeczny (niebezpieczny)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}