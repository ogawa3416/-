package sample;

public class Card {

	private int number;
	private String mark;

	public Card(int number, String mark) {
		this.number = number;
		this.mark = mark;
	}

	public boolean isJoker() {
		return (this.number == 14);
	}

	public String getNumber() {
		String n = String.valueOf(number);

		if (n.equals("11")) {
			n = "ジャック";
		} else if (n.equals("12")) {
			n = "クイーン";
		} else if (n.equals("13")) {
			n = "キング";
		} else {
			// 処理は何もしない
		}

		return n;
	}

	public String getMark() {
		return mark;
	}

}
