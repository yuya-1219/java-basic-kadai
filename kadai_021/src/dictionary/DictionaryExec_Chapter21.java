package dictionary;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 a = new Dictionary_Chapter21();
		String[] what = {"apple", "banana", "grape", "orange"};
		for(int i = 0; i < 4; i++) {
			a.dictionary(what[i]);
		}
	}
}
