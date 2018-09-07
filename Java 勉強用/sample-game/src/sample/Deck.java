package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();

	public Deck() {

		// カードの追加
		for (int i = 1; i <= 13; i++) {
			Card card = new Card(i, "スペード");
			cards.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Card(i, "クローバー");
			cards.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Card(i, "ダイヤ");
			cards.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Card(i, "ハート");
			cards.add(card);
		}

		// ジョーカーの追加
		Card joker1 = Card.getJoker();
		cards.add(joker1);

		Card joker2 = Card.getJoker();
		cards.add(joker2);

		Collections.shuffle(cards);
	}

	// デッキの表示
	public void printcards() {
		System.out.println(cards);
	}

	// デッキからカードを引く
	public Card draw() {
		if (cards == null || cards.size() == 0) {
			return null;
		}

		Card drawcard = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);
		return drawcard;
	}

	// デッキのシャッフル
	public void shuffle() {
		Collections.shuffle(cards);
	}

	// デッキにカードを戻す
	public void put(Card card) {
		cards.add(card);
	}

	// カードを2枚引いて強いカードを表示
	public void StrongCard() {
		Card drawcard1 = draw();
		Card drawcard2 = draw();

		int cardnumber1 = drawcard1.getintNumber();
		int cardnumber2 = drawcard2.getintNumber();
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
		if (Integer.compare(cardnumber1, cardnumber2) > 0) {
			System.out.println("マーク:" + drawcard1.getMark() + " 数字:" + drawcard1.getNumber());
		} else if (Integer.compare(cardnumber1, cardnumber2) < 0) {
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

}
