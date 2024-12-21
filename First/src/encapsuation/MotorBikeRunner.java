package encapsuation;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		ducati.start();
		honda.start();
		ducati.setSpeed(100);
		System.out.println("original ducati Speed: "+ducati.getSpeed());
		ducati.increaseSpeed(100);
		/*int ducatiSpeed=ducati.getSpeed();
		ducatiSpeed+=100;
		ducati.setSpeed(ducatiSpeed);*/
		System.out.println("new ducati Speed: "+ducati.getSpeed());
		ducati.decreaseSpeed(25);
		System.out.println("after decrease: "+ducati.getSpeed());
		honda.increaseSpeed(250);
		honda.setSpeed(50);
		System.out.println("original Honda Speed: "+honda.getSpeed());
		/*int hondaSpeed=honda.getSpeed();
		hondaSpeed+=250;
		honda.setSpeed(hondaSpeed);*/
		System.out.println("new honda Speed: "+honda.getSpeed());
		honda.decreaseSpeed(45);
		System.out.println("after decrease: "+honda.getSpeed());
	}

}
