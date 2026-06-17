package jyanken;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		Jyanken_Chapter28 a = new Jyanken_Chapter28();
		String my = a.getMyChoice();
		String ai = a.getRandom();
		a.playGame(my, ai);
	}
}
