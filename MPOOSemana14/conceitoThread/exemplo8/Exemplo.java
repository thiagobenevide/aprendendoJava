package exemplo8;
class Exemplo implements Runnable {
	private int y;
	public void run() {
		f("run");
	}
	public void f(String x) {
		y++;
		System.out.println(x + " Valor de y: " + y);
	}
}