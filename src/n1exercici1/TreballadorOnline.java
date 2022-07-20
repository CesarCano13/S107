package n1exercici1;

public class TreballadorOnline extends Treballador {

	private static double INTERNET = 78.95;

	public TreballadorOnline(String nom, String apell, double precHora) {
		super(nom, apell, precHora);

	}

	@Override
	public void calcularSueldo(double horas) {
		double sueldo = 0.0;

		sueldo = (horas * super.getPrecHora()) + INTERNET;

		System.out.println(sueldo);
	}

}
