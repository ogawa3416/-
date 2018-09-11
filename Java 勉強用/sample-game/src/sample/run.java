package sample;

public class run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		// deck.printcards();
		battle(deck);

	}

	// 出力処理
	public static void outputCard(Card card) {
		System.out.println(card.getMarkAndNumber());
	}

	// カードを引いて勝負
	public static void battle(Deck deck) {
		System.out.println("カードを2枚引いて勝負します");
		Card drawcard1 = deck.draw();
		Card drawcard2 = deck.draw();
		outputCard(drawcard1);
		outputCard(drawcard2);

		int compare = drawcard1.compare(drawcard2);

		if (compare < 0) {
			System.out.println("1枚目の勝ちです");
		} else if (compare > 0) {
			System.out.println("2枚目の勝ちです");
		} else {
			System.out.println("引き分けです");
		}
	}

}