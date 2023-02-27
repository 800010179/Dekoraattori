package app;

import java.time.LocalDate;

public class PvmDecorator extends DataRakenneDecorator{

	public PvmDecorator(DataRakenne dataRakenneToBeDecorated) {
		super(dataRakenneToBeDecorated);

	}
	
	@Override
	public void kerroData() {
		super.kerroData();
		kerroPvm();
	}
	
	private void kerroPvm() {
		LocalDate pvm = LocalDate.now(); 
	    System.out.println("Tieto luettu: " + pvm);
	}
	
}
