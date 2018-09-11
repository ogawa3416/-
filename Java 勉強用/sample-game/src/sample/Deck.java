package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();

	public Deck() {

		// カードの追加
		for (int i = 1; i <= 13; i++) {
			Card card = new Card("スペード", i);
			cards.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Card("クローバー", i);
			cards.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Card("ダイヤ", i);
			cards.add(card);
		}
		for (int i = 1; i <= 13; i++) {
			Card card = new Card("ハート", i);
			cards.add(card);
		}

		// ジョーカーの追加
		Card joker1 = Card.createJoker();
		cards.add(joker1);

		Card joker2 = Card.createJoker();
		cards.add(joker2);
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

}
