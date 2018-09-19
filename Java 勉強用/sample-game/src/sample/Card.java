package sample;

public class Card {

	private int number;
	private String mark;

	public Card(String mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public boolean isJoker() {
		return (this.number == 14);
	}

	public static Card getJoker() {
		Card joker = new Card("ジョーカー", 14);
		return joker;
	}

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
		case 1:
			n = "エース";
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

	public String getMarkAndNumber() {
		String str;
		if (this.isJoker()) {
			str = getMark();
		} else {
			str = getMark() + "の" + getNumber();
		}
		return str;
	}

	public Card getCard(Card card) {
		return card;
	}

	// 受け取ったカードと強さを比較
	public int compare(Card card) {
		Integer cardNumber1 = getintNumber();
		Integer cardNumber2 = card.getintNumber();
		// マークがエースの場合13を加算
		if (cardNumber1 == 1) {
			cardNumber1 += 13;
		}
		if (cardNumber2 == 1) {
			cardNumber2 += 13;
		}

		String cardmark1 = getMark();
		String cardmark2 = card.getMark();
		int compareNumber = cardNumber1.compareTo(cardNumber2);

		// 数字が同じだった場合マークで判定
		if (compareNumber == 0) {
			if (cardmark1.equals("ジョーカー")) {
				if (cardmark2.equals("ジョーカー")) {
					compareNumber = 0;
				} else {
					compareNumber = -1;
				}
			} else if (cardmark2.equals("ジョーカー")) {
				compareNumber = 1;
			} else if (cardmark1.equals("スペード")) {
				compareNumber = 1;
			} else if (cardmark2.equals("スペード")) {
				compareNumber = -1;
			} else if (cardmark1.equals("ハート")) {
				compareNumber = 1;
			} else if (cardmark2.equals("ハート")) {
				compareNumber = -1;
			} else if (cardmark1.equals("ダイヤ")) {
				compareNumber = 1;
			} else if (cardmark2.equals("ダイヤ")) {
				compareNumber = -1;
			} else {
				compareNumber = 0;
			}
		}

		return compareNumber;
	}

}
