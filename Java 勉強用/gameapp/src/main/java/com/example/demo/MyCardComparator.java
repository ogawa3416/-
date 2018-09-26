package com.example.demo;

import java.util.Comparator;

public class MyCardComparator implements Comparator<Card> {
	public int compare(Card card1, Card card2) {

		String cardMark1 = card1.getMark();
		String cardMark2 = card2.getMark();
		int cardNumber1 = card1.getintNumber();
		int cardNumber2 = card2.getintNumber();

		// マークがジョーカーの場合1を加算(15扱い)
		if (cardNumber1 == 14)
			cardNumber1 += 1;
		if (cardNumber2 == 14)
			cardNumber2 += 1;

		// 数字がエースの場合13を加算(14扱い)
		if (cardNumber1 == 1)
			cardNumber1 += 13;
		if (cardNumber2 == 1)
			cardNumber2 += 13;

		// 数字の比較(数字が同じだった場合マークで比較)
		if (cardNumber1 < cardNumber2) {
			return -1;
		} else if (cardNumber1 > cardNumber2) {
			return 1;
		} else {
			if (cardMark1.equals("ジョーカー")) {
				if (cardMark2.equals("ジョーカー")) {
					return 0;
				} else {
					return -1;
				}
			} else if (cardMark2.equals("ジョーカー")) {
				return 1;
			} else if (cardMark1.equals("スペード")) {
				return 1;
			} else if (cardMark2.equals("スペード")) {
				return -1;
			} else if (cardMark1.equals("ハート")) {
				return 1;
			} else if (cardMark2.equals("ハート")) {
				return -1;
			} else if (cardMark1.equals("ダイヤ")) {
				return 1;
			} else if (cardMark2.equals("ダイヤ")) {
				return -1;
			} else {
				return 0;
			}
		}
	}

}