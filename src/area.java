
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=10, length=20, high=30;
		double area, volume, pi=3.1415926;
		area=(width/2)*(width/2)*pi;
		volume=area*high;
		System.out.println("Circle area= " + area);
		System.out.println("Rectangle area= " + width*length);
		System.out.println("Volume= " + volume);
	}

}
