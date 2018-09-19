package sample;

import java.util.ArrayList;
import java.util.Collections;

public class run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		// deck.printcards();
		battle2(deck);
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

	public static void battle2(Deck deck) {

		Card drawcard1 = deck.draw();
		Card drawcard2 = deck.draw();
		Card drawcard3 = deck.draw();
		Card drawcard4 = deck.draw();
		Card drawcard5 = deck.draw();

		ArrayList<Card> list = new ArrayList<>();
		list.add(drawcard1);
		list.add(drawcard2);
		list.add(drawcard3);
		list.add(drawcard4);
		list.add(drawcard5);

		for (Card c : list) {
			System.out.println(c.getMarkAndNumber());
		}

		System.out.println("--------------------------------------");

		Collections.sort(list, new MyCardComparator());

		for (Card c : list) {
			System.out.println(c.getMarkAndNumber());
		}

		Card strongcard = list.get(list.size() - 1);
		String MarkAndNumber = strongcard.getMarkAndNumber();
		Card strongcard2 = list.get(list.size() - 2);
		String mark2 = strongcard2.getMark();
		String MarkAndNumber2 = strongcard2.getMarkAndNumber();

		if (mark2.equals("ジョーカー")) {
			System.out.println("一番強いカードは" + MarkAndNumber + "と" + MarkAndNumber2 + "です");
		}

		System.out.println("一番強いカードは" + MarkAndNumber + "です");

	}

}