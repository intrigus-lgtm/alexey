package alexey;

public class ReleaseOrderWrong {
	int x;
	volatile int g;
	int r1, r2;

	public void actor1() {
		g = 1;
		x = 1;
	}

	public void actor2() {
		r1 = g;
		r2 = x;
	}
}