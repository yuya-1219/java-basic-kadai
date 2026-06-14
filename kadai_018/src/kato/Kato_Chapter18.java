package kato;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	public void setGiveName() {
	}
	public void commonIntroduce() {
		System.out.println("住所は" + this.address + "です");
		System.out.println("名前は" + this.familyName + this.givenName + "です");
	}
	abstract public void eachIntroduce();
	public void execlntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
}
