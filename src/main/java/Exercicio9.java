import javax.swing.JOptionPane;

public class Exercicio9{

    public static void main(String[] args) {
    int numero;
     numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número: ")); 
     if (numero % 2 == 0){
         JOptionPane.showMessageDialog(null,"O seu numero  é multiplo de 2: ");
     }else{ JOptionPane.showMessageDialog(null,"O seu numero nào é multiplo de 2: ");}
    
     }
}
