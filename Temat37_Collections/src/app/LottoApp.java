package app;

import java.util.Arrays;
import java.util.List;

import data.Lotto;

public class LottoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lotto lotto = new Lotto();
		lotto.generate();
		lotto.randomize();
		Integer[] userTotolotekArray = {5, 4, 10, 15, 47, 32};
		List<Integer> userTotolotek = Arrays.asList(userTotolotekArray);
		lotto.checkResult(userTotolotek);
	}

}
