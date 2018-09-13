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

	// カード5枚の比較(作成中)
	public int compare2(Card card1, Card card2, Card card3, Card card4) {

		int[] Numbers = new int[4];
		Numbers[0] = getintNumber();
		Numbers[1] = card1.getintNumber();
		Numbers[2] = card2.getintNumber();
		Numbers[3] = card3.getintNumber();
		Numbers[4] = card4.getintNumber();

		// マークがジョーカーの場合1を加算(15扱い)
		for (int i = 0; i < 5; i++) {
			if (Numbers[i] == 14)
				Numbers[i] += 1;
		}

		// マークがエースの場合13を加算(14扱い)
		for (int i = 0; i < 5; i++) {
			if (Numbers[i] == 1)
				Numbers[i] += 13;
		}

		String cardmark1 = getMark();
		String cardmark2 = card1.getMark();
		String cardmark3 = card2.getMark();
		String cardmark4 = card3.getMark();
		String cardmark5 = card4.getMark();

		return Numbers[0];

	}

}
