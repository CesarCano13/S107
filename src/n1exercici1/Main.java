package n1exercici1;

public class Main {

	public static void main(String[] args) {

		Treballador treballador = new Treballador("César", "Cano", 10.5);
		TreballadorOnline treballadorOnline = new TreballadorOnline("Ikki", "Alves", 11.85);
		TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Chari", "Broock", 20.50);

		treballador.calcularSueldo(48);

		treballadorOnline.calcularSueldo(22);

		treballadorPresencial.calcularSueldo(120);

	}

}
