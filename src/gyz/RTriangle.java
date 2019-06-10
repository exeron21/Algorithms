package gyz;

public class RTriangle extends Triangle{

    RTriangle(double Rside1, double Rside2) {
        side1 = Rside1;
        side2 = Rside2;
    }

	public double getArea(){
		System.out.print("Calculated by Rside1*Rside2:");
		return side1 * side2 / 2;
	}
}

