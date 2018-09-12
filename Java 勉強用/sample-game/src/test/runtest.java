package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import sample.Card;
import sample.Deck;
import sample.run;

class runtest {

	@Test
	void test0() {
		// Cardを作成して表示
		Card card = new Card(8, "スペード");
		run.outputNumber(card);
		run.outputMark(card);

		Assert.assertEquals(card.getMark(), "スペード");
		Assert.assertEquals(card.getNumber(), "8");
	}

	@Test
	void test1() {
		// デッキを作成してカードを引く
		Deck deck = new Deck();
		Card card = deck.draw();
		run.outputNumber(card);
		run.outputMark(card);
	}

	@Test
	void test2() {
		Deck deck = new Deck();

		// スペードの8をデッキに置いてデッキからカードを1枚引く
		Card card = new Card(8, "スペード");
		deck.put(card);

		Card nextCard = deck.draw();
		run.outputNumber(nextCard);
		run.outputMark(nextCard);

	}

	@Test
	void test3() {
		Deck deck = new Deck();

		// デッキから枚数を指定してカードを引く

		for (int i = 0; i < 2; i++) {
			Card card = deck.draw();

			if (card == null) {
				System.out.println("デッキにカードがありません");
			} else {
				run.outputNumber(card);
				run.outputMark(card);
			}
		}

	}

}
