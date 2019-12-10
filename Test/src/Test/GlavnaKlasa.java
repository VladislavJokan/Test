package Test;

import java.util.ArrayList;
import java.util.List;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		Osoba o1 = new Osoba();
		o1.setIme("Pera");
		o1.setPrezime("Peric");
		o1.setAdresa("Savski venac 11");
		o1.setJmbg("1234455667789");
		o1.setBrojGodina(28);
		o1.validacijaJMBG();
		
		System.out.println(o1.toString());
		
		Osoba o2 = new Osoba("Marko", "Markovic", "Lomina 24", "1234455667", 16);
		o2.validacijaJMBG();
		
		System.out.println(o2.toString());
		
		Ugovor u1 = new Ugovor(o1, o2, 90000, 32);
		Ugovor u2 = new Ugovor(o1, o2, 360000, 128);
		Ugovor u3 = new Ugovor(o1, o2, 180000, 64);
		
		List<Ugovor> lista = new ArrayList<Ugovor>();
		lista.add(u1);
		lista.add(u2);
		lista.add(u3);
		
		System.out.println(lista.toString());
		
		Banka banka = new Banka(lista, "Banka Intesa");
		
		banka.brojLuksuznihUgovora();
		banka.brojUgovora40();
		banka.najvrednijiUgovor();
		banka.najmanjeVredanLuksuzanUgovor();
		System.out.println(banka.prosecnoTrajanjeUgovora());
	}

}
