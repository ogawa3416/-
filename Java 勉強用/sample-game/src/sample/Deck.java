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

	// デッキにカードを戻してから引く
	public void PutDraw(Card card) {
		put(card);
		Card drawcard = draw();
		run.outputNumber(drawcard);
		run.outputMark(drawcard);
	}

	// カードを2枚引いて強いカードを表示
	public void StrongCard() {
		Card drawcard1 = draw();
		Card drawcard2 = draw();

		int cardnumber1 = drawcard1.getintNumber();
		int cardnumber2 = drawcard2.getintNumber();

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
			// 数字が同じ場合の処理を追加(マークで比較)
		}
	}

}
