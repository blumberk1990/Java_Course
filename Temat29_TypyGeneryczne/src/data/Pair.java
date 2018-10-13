package data;

public class Pair<T, V> {

	private T value1;
	private V value2;
	
	public Pair(T v1, V v2) {
		this.setValue1(v1);
		this.setValue2(v2);
	}
	
	public T getValue1() {
		return value1;
	}
	public void setValue1(T value1) {
		this.value1 = value1;
	}
	public V getValue2() {
		return value2;
	}
	public void setValue2(V value2) {
		this.value2 = value2;
	}
		
	@Override
	public String toString() {
		return "Utowrzono parê: " + "<" + value1 + ", " + value2 + ">";
	}
}
