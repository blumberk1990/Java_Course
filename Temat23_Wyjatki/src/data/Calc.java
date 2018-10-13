package data;

public class Calc {

	/*--Fields--*/
	private float value1;
	private float value2;
	private String sign;
	
	/*--Javabeans--*/
	public float getValue1() {
		return value1;
	}
	public void setValue1(float value1) {
		this.value1 = value1;
	}
	public float getValue2() {
		return value2;
	}
	public void setValue2(float value2) {
		this.value2 = value2;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	/*--Constructors--*/
	public Calc(float value1, String sign, float value2) {
		this.setValue1(value1);
		this.setSign(sign);
		this.setValue2(value2);
	}
	
	private float calcCalculation(Calc calc) {
		float result = 0;
		if(calc.getSign().equals("+")) {
			result = calc.getValue1() + calc.getValue2();
		} else if(calc.getSign().equals("-")) {
			result = calc.getValue1() - calc.getValue2();
		} else if(calc.getSign().equals("/")) {
			result = calc.getValue1() / calc.getValue2();
		} else if(calc.getSign().equals("*")) {
			result = calc.getValue1() * calc.getValue2();
		}
		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getValue1() + " " + getSign() + " " + getValue2() +  " = " + this.calcCalculation(this);
	}
}
