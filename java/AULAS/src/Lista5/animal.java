package Lista5;

public class animal {

	private String raca;
	private String ossos;
	private String andar;

	public animal(String raca, String andar, String ossos) {
		super();
		this.raca = raca;
		this.andar = andar;
		this.ossos = ossos;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getOssos() {
		return ossos;
	}

	public void setOssos(String ossos) {
		this.ossos = ossos;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

}
