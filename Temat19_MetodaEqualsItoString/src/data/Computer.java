package data;

public class Computer {

	/*--Fields--*/
	private String producer;
	private int model;

	/*--Javabeans--*/
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}

	/*--Constructors--*/
	public Computer(String producer, int model) {
		this.setProducer(producer);
		this.setModel(model);
	}

	/*--Metods--*/
	@Override
	public boolean equals(Object obj) {

		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Computer)) {
			return false;
		}	
		Computer comp = (Computer) obj;
		if(this.producer != null) {
			if(this.producer.equals(comp.getProducer()) && this.model == comp.getModel()) {
				return true;
			}
		} 
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Producent: " + producer + "; Model: " + model + ".";
	}
	
}
