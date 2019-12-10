package Test;

import java.util.ArrayList;
import java.util.List;

public class Banka {
	
	private List<Ugovor> nizUgovora = new ArrayList<Ugovor>();
	private String nazivBanke;
	private double ukupnaVrednostBanke;
	
	public Banka() {
		
	}
	
	public Banka(List<Ugovor> nizUgovora, String nazivBanke) {
		
		super();
		this.nizUgovora = nizUgovora;
		this.nazivBanke = nazivBanke;
		
		for (Ugovor u : nizUgovora) {
			this.ukupnaVrednostBanke += u.getVrednostUgovora();
		}
	}

	public List<Ugovor> getNizUgovora() {
		return nizUgovora;
	}

	public void setNizUgovora(List<Ugovor> nizUgovora) {
		this.nizUgovora = nizUgovora;
	}

	public String getNazivBanke() {
		return nazivBanke;
	}

	public void setNazivBanke(String nazivBanke) {
		this.nazivBanke = nazivBanke;
	}

	public double getUkupnaVrednostBanke() {
		return ukupnaVrednostBanke;
	}

	public void setUkupnaVrednostBanke(double ukupnaVrednostBanke) {
		this.ukupnaVrednostBanke = ukupnaVrednostBanke;
	}

	@Override
	public String toString() {
		return "Banka [nizUgovora=" + nizUgovora + ", nazivBanke=" + nazivBanke + ", ukupnaVrednostBanke="
				+ ukupnaVrednostBanke + "]";
	}
	
	public void najvrednijiUgovor() {
		
		double max = nizUgovora.get(0).getVrednostUgovora();
		
		for (Ugovor u : nizUgovora) {
			if (u.getVrednostUgovora() > max) {
				max = u.getVrednostUgovora();
			}
		}
		
		System.out.println("Najvredniji ugovor je: " + max);
	}
	
	public double prosecnoTrajanjeUgovora() {
		
		int brojUgovora = nizUgovora.size();
		int zbir = 0;
		
		for (Ugovor u : nizUgovora) {
			zbir += u.getVrednostUgovora();
		}
		
		return (double)zbir/brojUgovora;
	}
	
	public void brojLuksuznihUgovora() {
		
		int brojac = 0;
		
		for (Ugovor u : nizUgovora) {
			if (u.isLuksuzan() == true) {
				brojac++;
			}
		}
		
		System.out.println("Broj luksuznih ugovora je: " + brojac);
	}
	
	public void najmanjeVredanLuksuzanUgovor() {
		
		double min = nizUgovora.get(0).getVrednostUgovora();
		
		for (Ugovor u : nizUgovora) {
			if (u.isLuksuzan() == true && u.getVrednostUgovora() < min) {
				min = u.getVrednostUgovora();
			}
		}
		
		System.out.println("Najmanje vredni luksuzni ugovor je: " + min);
	}
	
	public void brojUgovora40() {
		
		int brojac = 0;
		
		for (Ugovor u : nizUgovora) {
			if (u.getFizickoLice().getBrojGodina() > 40) {
				brojac++;
			}
		}
		
		System.out.println("Broj ugovora gde je korisnik stariji od 40 je: " + brojac);
	}
}
