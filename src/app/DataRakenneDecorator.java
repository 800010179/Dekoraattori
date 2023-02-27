package app;

public abstract class DataRakenneDecorator implements DataRakenne{
	protected DataRakenne dataRakenneToBeDecorated;
	
	public DataRakenneDecorator(DataRakenne dataRakenneToBeDecorated) {
		this.dataRakenneToBeDecorated = dataRakenneToBeDecorated;
	}
	public void kerroData() {
		dataRakenneToBeDecorated.kerroData();
	}
}
