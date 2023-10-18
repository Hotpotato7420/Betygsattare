import javax.swing.JOptionPane;

public class Betygsattare {
    public static void main(String[] args) {


        int poaeng = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur många poaeng blev det?"));
        if (poaeng > 30 || poaeng < 0) {
            JOptionPane.showMessageDialog(null, "Felaktig data, för högt/lågt poäng");
        } else if (poaeng < 15) {
            JOptionPane.showMessageDialog(null, "Provet fick ett F");
        } else if (15 <= poaeng && poaeng < 18) {
            JOptionPane.showMessageDialog(null, "Provet fick ett E");
        } else if (poaeng < 21) {
            JOptionPane.showMessageDialog(null, "Provet fick ett D");
        } else if (poaeng < 24) {
            JOptionPane.showMessageDialog(null, "Provet fick ett C");
        } else if (poaeng < 27) {
            JOptionPane.showMessageDialog(null, "Provet fick ett B");
        } else  {
            JOptionPane.showMessageDialog(null, "Provet fick ett A");
        }
    }
}