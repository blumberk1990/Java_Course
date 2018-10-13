package data;

public enum Pizza {

	MARGHERITA(1, true, true, false, false),
	CAPRICIOSA(2, true, true, true, false),
	PROSCIUTTO(3, true, true, false, true);
	
	/*--Fields--*/
	private int nr;
	private boolean tomatoSauce;
	private boolean chees;
	private boolean champinion;
	private boolean ham;
	
	/*--Javabeans--*/
	public int getNr() {
		return nr;
	}

	public boolean getTomatoSauce() {
		return tomatoSauce;
	}

	public boolean getChees() {
		return chees;
	}

	public boolean getChampinion() {
		return champinion;
	}

	public boolean getHam() {
		return ham;
	}
	
	/*--Constructors--*/
	private Pizza(int nr, boolean tomatoSauce, boolean chees, boolean champinion, boolean ham) {
		this.nr = nr;
		this.tomatoSauce = tomatoSauce;
		this.chees = chees;
		this.champinion = champinion;
	}

	/*--Metods--*/
	@Override
	public String toString() {
		String result = "Brak pizzy";
		if(this.tomatoSauce == true && this.chees && !(this.champinion == true) && !(this.ham == true)) {
			result = "Pizza nr." + this.getNr() + " " + this.name() + " (sos pomidorowy + ser)"; 
		} else if(this.tomatoSauce == true && this.chees && this.champinion == true && !(this.ham == true)) {
			result = "Pizza nr." + this.getNr() + " " + this.name() + " (sos pomidorowy + ser + pieczarki)";
		} else if(this.tomatoSauce == true && this.chees && !(this.champinion == true) && this.ham == true) {
			result = "Pizza nr." + this.getNr() + " " + this.name() + " (sos pomidorowy + ser + pieczarki)";
		}
		return result;
	}
	
}
