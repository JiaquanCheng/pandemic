package alan;

public class andrew {

	public static void main(String[] args) {
		Vektor v = new Vektor();
		Vektor v2 = new Vektor();
		v.x = 1;
		v.y = 2;
		v.z = 3;
		v2.x = 4;
		v2.y = 5;
		v2.z = 6;
		Vektor v3 = v.add(v2);
		
		
		System.out.println(v3);
	}

}
