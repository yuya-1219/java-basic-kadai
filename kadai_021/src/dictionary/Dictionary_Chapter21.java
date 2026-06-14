package dictionary;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void dictionary(String english) {
		String japanese = "";
		HashMap<String,String> di = new HashMap<String,String>();
		di.put("apple","りんご" );
		di.put("peach", "桃");
		di.put("banana", "バナナ");
		di.put("lemon", "レモン");
		di.put("pear", "梨");
		di.put("kiwi", "キウィ");
		di.put("strawberry", "いちご");
		di.put("grape", "ぶどう");
		di.put("muscat", "マスカット");
		di.put("cherry", "さくらんぼ");
		
		japanese = di.get(english);
		if(japanese != null) {
			System.out.println(english + "の意味は" + japanese);
		} else {
			System.out.println(english + "は辞書に存在しません");
		}
		return;
	}
}
