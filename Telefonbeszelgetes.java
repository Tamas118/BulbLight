package jt;

public class Telefonbeszelgetes {

	private String elofizetoNeve;
	private String szolgaltato;
	private boolean csucsidoe;
	private int idotartam;


	public Telefonbeszelgetes(String elofizetoNeve, String szolgaltato, boolean csucsidoe, int idotartam) {
		super();
		this.elofizetoNeve = elofizetoNeve;
		this.szolgaltato = szolgaltato;
		this.csucsidoe = csucsidoe;
		this.idotartam = idotartam;
	}


	public String getElofizetoNeve() {
		return elofizetoNeve;
	}



	/*public int getIdotartam() {
		return idotartam;
	}*/


	public Boolean visszaadNevKeres(String megadottSzoveg){
		return elofizetoNeve.contains(megadottSzoveg);
	}


	@Override
	public String toString() {
		return "Telefonbeszelgetes [elofizetoNeve=" + elofizetoNeve + ", szolgaltato=" + szolgaltato + ", csucsidoe="
				+ csucsidoe + ", idotartam=" + idotartam + "]";
	}



	public void kiirHosszusag(){
		System.out.println();
		if (idotartam >= 300) {
			System.out.println("A hívás hosszú");
		}else if (idotartam > 30) {
			System.out.println("A hívás átlagos");	
		}else {
			System.out.println("A hívás rövid");
		}
	}
	public void kiirBeleesik(int beleesike) {
		System.out.print("Zoli 90mp-es beszélgetése beleesik-e 50mp és 100mp beszélgetés közé " + "-> " );
		if (50 < beleesike && beleesike < 100) {
			System.out.println("igen");
		}else {
			System.out.println("nem");
		}
	}
}






