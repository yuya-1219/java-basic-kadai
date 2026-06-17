package jyanken;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner = new Scanner(System.in);
	    String myhand = "";
	    do{
	    		myhand = scanner.nextLine();
	    		if(myhand.equals("r") || myhand.equals("s") || myhand.equals("p")) {
	    			break;
	    		} else {
	    			System.out.println("もう一度入力してください");
	    		}
	     } while (true);
	    
		scanner.close();
	    return myhand;
	}
	public String getRandom() {
		String rhand = "";
		String[] hand = {"r","s","p"};
		int random = (int) Math.floor(Math.random() * 3);
		rhand = hand[random];
		return rhand;
	}
	public void playGame(String a, String b) {
		HashMap<String,String> janken = new HashMap<String,String>();
		janken.put("r", "グー");
		janken.put("s", "チョキ");
		janken.put("p", "パー");
		
		if(a.equals("r") && b.equals("r")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("あいこです");
		}
		else if(a.equals("s") && b.equals("s")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("あいこです");
		}
		else if(a.equals("p") && b.equals("p")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("あいこです");
		}
		else if(a.equals("r") && b.equals("s")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("自分の勝ちです");
		}
		else if(a.equals("r") && b.equals("p")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("自分の負けです");
		}
		else if(a.equals("s") && b.equals("r")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("自分の負けです");
		}
		else if(a.equals("s") && b.equals("p")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("自分の勝ちです");
		}
		else if(a.equals("p") && b.equals("r")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("自分の勝ちです");
		}
		else if(a.equals("p") && b.equals("s")) {
			System.out.println("自分の手は" + janken.get(a) + "、対戦相手の手は" + janken.get(b));
			System.out.println("自分の負けです");
		}
	}
}
