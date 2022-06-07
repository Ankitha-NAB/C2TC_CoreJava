
import java.awt.*;
public class PrimitiveVsReferences {

	public static void main(String[] args) {
		int y;
		int x;
		/*byte x=1;
		byte y=x;
		x=2;
		System.out.println(y);//in primitive x and y both are independent*/
		Point point1=new Point(x=1, y=1);
		Point point2=point1;
		point1.x=2;
		System.out.println(point2);//references are copied by the references but primitives are copied by the values

	}

}
