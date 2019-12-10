package Test;

public class Osoba {
	
	private String ime;
	private String prezime;
	private String adresa;
	private String jmbg;
	private int brojGodina;
	
	public Osoba() {
		
	}

	public Osoba(String ime, String prezime, String adresa, String jmbg, int brojGodina) {
		
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.jmbg = jmbg;
		
		if (this.brojGodina >= 18) {
			this.brojGodina = brojGodina;
		} else {
			System.out.println("Korisnik ne moze da bude maloletan!");
		}
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getBrojGodina() {
		return brojGodina;
	}

	public void setBrojGodina(int brojGodina) {
		this.brojGodina = brojGodina;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + ", jmbg=" + jmbg + ", brojGodina="
				+ brojGodina + "]";
	}
	
	public boolean validacijaJMBG() {
		if (this.jmbg.length() == 13) {
			System.out.println("Prosledjeni jmbg je validan.");
			return true;
		} else {
			System.out.println("Prosledjeni jmbg nije validan!");
			return false;
		}
	}
}
