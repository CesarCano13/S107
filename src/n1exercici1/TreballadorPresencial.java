package n1exercici1;

public class TreballadorPresencial extends Treballador {

	private static double GASOLINA = 158.9;

	public TreballadorPresencial(String nom, String apell, double precHora) {
		super(nom, apell, precHora);

	}

	@Override
	public void calcularSueldo(double horas) {
		double sueldo = 0.0;

		sueldo = (horas * super.getPrecHora()) + GASOLINA;

		System.out.println(sueldo);
	}

}
