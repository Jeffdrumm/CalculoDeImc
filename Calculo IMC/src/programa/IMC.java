package programa;

import javax.swing.JOptionPane;

import entidade.Calculo;

public class IMC {

	public static void main(String[] args) {
		Calculo calculo = new Calculo();
		
		calculo.altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura"));
		
		calculo.peso = Double.parseDouble(JOptionPane.showInputDialog(" Informe o Peso"));

		JOptionPane.showMessageDialog(null, "O IMC � "+ calculo.medida(), 
				"C�lculo de IMC", javax.swing.JOptionPane.WARNING_MESSAGE);
	}
}