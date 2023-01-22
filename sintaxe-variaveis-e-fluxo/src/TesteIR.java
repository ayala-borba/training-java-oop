
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3900.0;

		if (salario < 1900.0) {
			System.out.println("Você é isento de IR.");
		} else if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR é de 7.5%" + "\n" + "Você pode deduzir na declaração o valor de R$ 142,00");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("O IR é de 15%" + "\n" + "Você pode deduzir na declaração o valor de R$ 350,00");
		} else {
			System.out.println("O IR é de 22.5%" + "\n" + "Você pode deduzir na declaração o valor de R$ 636,00");
		}

	}
}
