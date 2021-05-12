package alan;


public class Vektor {
	int x;
	int y;
	int z;
	
	public Vektor() {
	this.x = 0;
	this.y = 0;
	this.z = 0;
	}
	public Vektor add(Vektor a) {
		Vektor ret = new Vektor();
		ret.x = a.x + this.x;
		ret.y = a.y + this.y;
		ret.z = a.z + this.z;

		return ret;
	}
}
