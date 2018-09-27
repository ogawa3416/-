package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Run {
	public static String output = "";

	public static String outputResult = "";

	public static void println(String str) {
		// System.out.println(str);
		output += str + "\n";
	}

	public static void printlnResult(String str) {
		// System.out.println(str);
		outputResult += str;
	}

	// public static void main(String[] args) {
	// Deck deck = new Deck();
	// deck.printcards();
	// battle2(deck);
	// }

	public static void run() {
		Deck deck = new Deck();
		// deck.printcards();
		battle2(deck);
	}

	public static void outputNumber(Card card) {
		if (card.isJoker()) {
			println("このトランプはジョーカーです");
		} else {
			println("このトランプの数字は" + card.getNumber() + "です");
		}
	}

	// 出力処理(マーク)
	public static void outputMark(Card card) {
		println("そしてマークは" + card.getMark() + "です");
	}

	// 出力処理(マーク+数字)
	public static void outputMarkAndNumber(Card card) {
		println(card.getMarkAndNumber());
	}

	public static void battle(Deck deck) {
		Card drawcard1 = deck.draw();
		Card drawcard2 = deck.draw();

		// 引いたカードの確認
		outputMarkAndNumber(drawcard1);
		outputMarkAndNumber(drawcard2);

		int compare = drawcard1.compare(drawcard2);

		if (compare > 0) {
			println("1枚目の勝ちです。");
		} else if (compare < 0) {
			println("2枚目の勝ちです。");
		} else {
			println("引き分けです。");
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
			println(c.getMarkAndNumber());
		}

		Collections.sort(list, new MyCardComparator());

		// ソート後のカードの表示
		// for (Card c : list) {
		// println(c.getMarkAndNumber());
		// }

		Card strongcard = list.get(list.size() - 1);
		String MarkAndNumber = strongcard.getMarkAndNumber();
		Card strongcard2 = list.get(list.size() - 2);
		String mark2 = strongcard2.getMark();
		String MarkAndNumber2 = strongcard2.getMarkAndNumber();

		if (mark2.equals("ジョーカー")) {
			printlnResult("一番強いカードは" + MarkAndNumber + "と" + MarkAndNumber2 + "です");
		} else {
			printlnResult("一番強いカードは" + MarkAndNumber + "です");
		}
	}
}
