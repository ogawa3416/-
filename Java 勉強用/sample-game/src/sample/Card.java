package sample;

public class Card {

	private String mark;
	private int number;

	public Card(String mark, int number) {
		this.mark = mark;
		this.number = number;
	}

	public boolean isJoker() {
		return (this.number == 14);
	}

	public static Card createJoker() {
		return new Card("ジョーカー", 14);
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

	public String getMarkAndNumber() {
		String str;
		if (this.isJoker()) {
			str = getMark();
		} else {
			str = getMark() + "の" + getNumber();
		}
		return str;
	}

	// 受け取ったCardの数字との比較
	public int compare(Card card) {
		int compare;

		if (this.mark.equals("ジョーカー")) {
			if (card.mark.equals("ジョーカー")) {
				compare = 0;
			} else {
				compare = -1;
			}
		} else if (card.mark.equals("ジョーカー")) {
			compare = -1;
		} else {
			int n1 = this.number;
			int n2 = card.number;
			if (n1 > n2) {
				compare = -1;
			} else if (n1 < n2) {
				compare = 1;
			} else {
				// 同値の場合マークで判定
				if (this.mark.equals("スペード")) {
					compare = -1;
				} else if (card.mark.equals("スペード")) {
					compare = 1;
				} else if (this.mark.equals("ハート")) {
					compare = -1;
				} else if (card.mark.equals("ハート")) {
					compare = 1;
				} else if (this.mark.equals("ダイヤ")) {
					compare = -1;
				} else if (card.mark.equals("ダイヤ")) {
					compare = 1;
				} else {
					compare = 0;
				}
			}
		}
		return compare;
	}
}
