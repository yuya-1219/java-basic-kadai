package car_Chapter15;

public class Car_Chapter15 {
    private int    gear = 1;
    private int    speed = 10;
	public void changeGear(int afterGear) {
		this.gear = afterGear;
		if(this.gear == 1) {
			this.speed = 10;
			System.out.print("ギア1からギア");
			System.out.print(afterGear);
			System.out.println("に切り替えました。");
		}
		else if(this.gear == 2) {
			this.speed = 20;
			System.out.print("ギア1からギア");
			System.out.print(afterGear);
			System.out.println("に切り替えました。");
		}
		else if(this.gear == 3) {
			this.speed = 30;
			System.out.print("ギア1からギア");
			System.out.print(afterGear);
			System.out.println("に切り替えました。");
		}
		else if(this.gear == 4) {
			this.speed = 40;
			System.out.print("ギア1からギア");
			System.out.print(afterGear);
			System.out.println("に切り替えました。");
		}
		else if(this.gear == 5) {
			this.speed = 50;
			System.out.print("ギア1からギア");
			System.out.print(afterGear);
			System.out.println("に切り替えました。");
		}
		else {
			this.speed = 10;
			System.out.println("上記以外のギアに切り替えました。");
		}
		return;
	}
	public void run() {
		System.out.print("速度は時速");
		System.out.print(this.speed);
		System.out.println("kmです");
	}
}
