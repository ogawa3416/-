package sample;

public class run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		// deck.printcards();

		for (int i = 0; i < 10; i++) {
			Card card = deck.draw();

			if (card == null) {
				System.out.println("デッキにカードがありません");
			} else {
				outputNumber(card);
				outputMark(card);
			}
		}
	}

	// 出力処理(数字)
	public static void outputNumber(Card card) {
		if (card.isJoker()) {
			System.out.println("このトランプはジョーカーです");
		} else {
			System.out.println("このトランプの数字は" + card.getNumber() + "です");
		}
	}

	// 出力処理(マーク)
	public static void outputMark(Card card) {
		System.out.println("そしてマークは" + card.getMark() + "です");
	}
}
