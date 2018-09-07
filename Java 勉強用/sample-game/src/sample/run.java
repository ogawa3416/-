package sample;

public class run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		// deck.printcards();

		// カードを2枚引いて強いカードを表示
		Card drawcard1 = deck.draw();
		Card drawcard2 = deck.draw();

		String cardmark1 = drawcard1.getMark();
		String cardmark2 = drawcard2.getMark();

		// 引いたカードの確認
		run.outputNumber(drawcard1);
		run.outputMark(drawcard1);
		run.outputNumber(drawcard2);
		run.outputMark(drawcard2);

		// 強い方のカードを表示
		System.out.println("------------------------------");
		System.out.println("強い方のカード");
		if (drawcard1.compare(drawcard2) > 0) {
			System.out.println("マーク:" + drawcard1.getMark() + " 数字:" + drawcard1.getNumber());
		} else if (drawcard1.compare(drawcard2) < 0) {
			System.out.println("マーク:" + drawcard2.getMark() + " 数字:" + drawcard2.getNumber());
		} else {
			if (cardmark1.equals("スペード")) {
				System.out.println("マーク:" + drawcard1.getMark() + " 数字:" + drawcard1.getNumber());
			} else if (cardmark2.equals("スペード")) {
				System.out.println("マーク:" + drawcard2.getMark() + " 数字:" + drawcard2.getNumber());
			} else if (cardmark1.equals("ハート")) {
				System.out.println("マーク:" + drawcard1.getMark() + " 数字:" + drawcard1.getNumber());
			} else if (cardmark2.equals("ハート")) {
				System.out.println("マーク:" + drawcard2.getMark() + " 数字:" + drawcard2.getNumber());
			} else if (cardmark1.equals("ダイヤ")) {
				System.out.println("マーク:" + drawcard1.getMark() + " 数字:" + drawcard1.getNumber());
			} else if (cardmark2.equals("ダイヤ")) {
				System.out.println("マーク:" + drawcard2.getMark() + " 数字:" + drawcard2.getNumber());
			} else {
				System.out.println("引き分け");
				System.out.println("マーク:" + drawcard1.getMark() + " 数字:" + drawcard1.getNumber());
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