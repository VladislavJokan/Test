package Test;

public class Ugovor {
	
	private Osoba fizickoLice;
	private Osoba sluzbenoLice;
	private double vrednostUgovora;
	private int trajanjeUgovora;
	private boolean luksuzan;
	
	public Ugovor() {
		
	}
	
	public Ugovor(Osoba fizickoLice, Osoba sluzbenoLice, double vrednostUgovora, int trajanjeUgovora) {
		
		super();
		this.fizickoLice = fizickoLice;
		this.sluzbenoLice = sluzbenoLice;
		this.vrednostUgovora = vrednostUgovora;
		this.trajanjeUgovora = trajanjeUgovora;
		
		if (vrednostUgovora > 10000) {
			this.luksuzan = true;
		} else {
			this.luksuzan = false;
		}
	}

	public Osoba getFizickoLice() {
		return fizickoLice;
	}

	public void setFizickoLice(Osoba fizickoLice) {
		this.fizickoLice = fizickoLice;
	}

	public Osoba getSluzbenoLice() {
		return sluzbenoLice;
	}

	public void setSluzbenoLice(Osoba sluzbenoLice) {
		this.sluzbenoLice = sluzbenoLice;
	}

	public double getVrednostUgovora() {
		return vrednostUgovora;
	}

	public void setVrednostUgovora(double vrednostUgovora) {
		this.vrednostUgovora = vrednostUgovora;
	}

	public int getTrajanjeUgovora() {
		return trajanjeUgovora;
	}

	public void setTrajanjeUgovora(int trajanjeUgovora) {
		this.trajanjeUgovora = trajanjeUgovora;
	}

	public boolean isLuksuzan() {
		return luksuzan;
	}

	public void setLuksuzan(boolean luksuzan) {
		this.luksuzan = luksuzan;
	}

	@Override
	public String toString() {
		return "Ugovor [fizickoLice=" + fizickoLice + ", sluzbenoLice=" + sluzbenoLice + ", vrednostUgovora="
				+ vrednostUgovora + ", trajanjeUgovora=" + trajanjeUgovora + ", luksuzan=" + luksuzan + "]";
	}
}
