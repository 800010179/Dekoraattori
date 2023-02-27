package app;

public class Main {

	public static void main(String[] args) {
		DataRakenne decoratedDataRakenne = new SalasanaDecorator(new PvmDecorator(new SimppeliDataRakenne()));
		
		decoratedDataRakenne.kerroData();
	}

}
