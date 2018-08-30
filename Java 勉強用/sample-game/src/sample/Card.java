package sample;

public class Card {

	private int number;
	private String mark;

	public Card(int number, String mark) {
		this.number = number;
		this.mark = mark;
	}

	public String getNumber() {
		String n = String.valueOf(number);
		return n;
	}

	public String getMark() {
		return mark;
	}

}
