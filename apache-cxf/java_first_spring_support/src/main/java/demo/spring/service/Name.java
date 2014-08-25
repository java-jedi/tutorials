package demo.spring.service;

public class Name {

	private String value = null;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Name [value=" + value + "]";
	}
	
	
}
