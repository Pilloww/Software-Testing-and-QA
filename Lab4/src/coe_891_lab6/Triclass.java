package coe_891_lab6;

public class Triclass {
	public static String classify(int x, int y, int z) {
		if(x<1 || x>10 || y<1 || y>10 || z<1 || z>10) {
			return "Not a valid triangle";
		}
		if((x+y)>z && (x+z)>y && (y+z)>x) {
			if(x!=y && y!=z && x!=z) {
				return "Scalene triangle";
			}
			if((x==y && y!=z) || (y==z && z!=x) || (x==z && z!=y)) {
				return "Isosceles triangle";
			}
			if(x==y && y==z) {
				return "Equalateral triangle";
			}
		}else {
			return "Not a valid triangle";
		}
		return "Not a valid triangle";
	}
}
