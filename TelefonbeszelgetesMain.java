package jt;

public class TelefonbeszelgetesMain {

	public static void main(String[] args) {


		Telefonbeszelgetes telefon = new Telefonbeszelgetes("Zoltán", "Vodafone", true, 55);
		System.out.println(telefon);

		telefon.kiirHosszusag();


		System.out.println(telefon.visszaadNevKeres("Zol"));

		telefon.kiirBeleesik(90);
	}

}
