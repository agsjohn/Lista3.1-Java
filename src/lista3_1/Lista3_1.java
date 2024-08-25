package lista3_1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lista3_1 {
    public static void main(String[] args) {
        float salario;
        int horaTrabalhada;
        int horaExtraTrabalhada;
        DecimalFormat df = new DecimalFormat("0.00");
        horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as horas Trabalhadas: "));
        horaTrabalhada *= 20;
        horaExtraTrabalhada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as horas Trabalhadas (caso tenha): "));
        horaExtraTrabalhada *= 25;
        salario = (float) horaTrabalhada + horaExtraTrabalhada;
        df.setRoundingMode(RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null, "O salário do funcionário é " + df.format(salario));
    }    
}
