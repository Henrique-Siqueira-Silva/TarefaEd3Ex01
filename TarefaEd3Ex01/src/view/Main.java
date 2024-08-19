package view;
import javax.swing.JOptionPane;
import controller.TarefaEd3EX01;

public class Main {
		public static void main(String[] args) {
		TarefaEd3EX01 m = new TarefaEd3EX01();
		double num = 0;
		int resp = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
		
		resp = m.Ex01(num, 0);
		System.out.println(resp);
	}
}
