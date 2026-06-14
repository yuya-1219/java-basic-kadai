package kato;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		Kato_Chapter18 ihiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		taro.setGiveName();
		taro.execlntroduce();
		ihiro.setGiveName();
		ihiro.execlntroduce();
		hanako.setGiveName();
		hanako.execlntroduce();
	}
	
}
