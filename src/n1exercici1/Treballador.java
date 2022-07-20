package n1exercici1;

public class Treballador {

	private String nom;
	private String apell;
	private double precHora;

	public Treballador(String nom, String apell, double precHora) {
		this.nom = nom;
		this.apell = apell;
		this.precHora = precHora;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApell() {
		return apell;
	}

	public void setApell(String apell) {
		this.apell = apell;
	}

	public double getPrecHora() {
		return precHora;
	}

	public void setPrecHora(double precHora) {
		this.precHora = precHora;
	}

	public void calcularSueldo(double horas) {
		double sueldo = 0.0;

		sueldo = horas * precHora;

		System.out.println(sueldo);
	}

}
