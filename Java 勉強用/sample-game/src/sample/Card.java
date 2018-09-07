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

	public static Card getJoker() {
		Card joker = new Card(14, "ジョーカー");
		return joker;
	}

	// public static Card getJoker() {
	// Card joker = new Card(14, "ジョーカー");
	// return joker;
	// }

	public String getNumber() {
		String n;

		switch (number) {
		case 11:
			n = "ジャック";
			break;
		case 12:
			n = "クイーン";
			break;
		case 13:
			n = "キング";
			break;
		case 14:
			n = "ジョーカー";
			break;
		default:
			n = String.valueOf(number);
		}

		return n;
	}

	public int getintNumber() {
		return number;
	}

	public String getMark() {
		return mark;
	}

	// 受け取ったCardの数字との比較
	public int compare(Card anotherCard) {
		int cardNumber1 = getintNumber();
		int cardNumber2 = anotherCard.getintNumber();
		int compareNumber = Integer.compare(cardNumber1, cardNumber2);
		return compareNumber;
	}

}
