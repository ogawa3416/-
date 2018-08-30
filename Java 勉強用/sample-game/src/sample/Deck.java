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
		Card joker1 = new Card(14, "ジョーカー");
		cards.add(joker1);

		Card joker2 = new Card(14, "ジョーカー");
		cards.add(joker2);

		Collections.shuffle(cards);
	}

	public void printcards() {
		System.out.println(cards);
	}

	public Card draw() {
		int i = 0;
		Card drawcard = cards.get(i);
		i++;
		return drawcard;
	}

}
