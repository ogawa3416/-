package sample;

public class run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		// deck.printcards();
		battle(deck);
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

	// 出力処理(マーク+数字)
	public static void outputMarkAndNumber(Card card) {
		System.out.println(card.getMarkAndNumber());
	}

	public static void battle(Deck deck) {
		Card drawcard1 = deck.draw();
		Card drawcard2 = deck.draw();

		// 引いたカードの確認
		outputMarkAndNumber(drawcard1);
		outputMarkAndNumber(drawcard2);

		int compare = drawcard1.compare(drawcard2);

		if (compare > 0) {
			System.out.println("1枚目の勝ちです。");
		} else if (compare < 0) {
			System.out.println("2枚目の勝ちです。");
		} else {
			System.out.println("引き分けです。");
		}

	}

}