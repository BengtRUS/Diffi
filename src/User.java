
public class User {
	private int x,y;
	public int generate(int p){
		x=(int) (Math.random()*p);
		return x;
	}
	public int count(int p, int a){
		y = (int) Math.pow(a, x)%p;
		return y;
	}
	public int key(int y2, int p){
		int k = (int) Math.pow(y2, x)%p;
		return k;
	}
	
}
