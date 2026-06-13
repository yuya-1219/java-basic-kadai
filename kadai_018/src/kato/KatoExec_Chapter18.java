package kato;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		KatoTaro_Chapter18 ta = new KatoTaro_Chapter18();
		Kato_Chapter18 ihiro = new KatoIchiro_Chapter18();
		KatoIchiro_Chapter18 ihi = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		KatoHanako_Chapter18 hana = new KatoHanako_Chapter18();
		
		ta.setGiveName();
		taro.execlntroduce();
		ihi.setGiveName();
		ihiro.execlntroduce();
		hana.setGiveName();
		hanako.execlntroduce();
	}
	
}
