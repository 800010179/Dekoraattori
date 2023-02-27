package app;

import java.util.Scanner;

public class SalasanaDecorator extends DataRakenneDecorator{
	private final String salasana = "salis";
	public SalasanaDecorator(DataRakenne dataRakenneToBeDecorated) {
		super(dataRakenneToBeDecorated);
	}

	@Override
	public void kerroData() {
		kysySalasanaa();
		super.kerroData();
	}
	
	private void kysySalasanaa() {
		Scanner skanneri = new Scanner(System.in);
	    System.out.println("Syötä salasana.");
	    String syote = skanneri.nextLine();
	    while(!salasana.equals(syote)) {
	    	System.out.println("Väärä salasana! Syötä salasana.");
	    	syote = skanneri.nextLine();
	    }
	    System.out.println("Oikea salasana!");
	}
}
