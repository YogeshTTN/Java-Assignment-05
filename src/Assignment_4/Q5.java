package Assignment_4;

public class Q5 implements Clickable, Accessible {
	public static void main(String[] args) {
		Q5 button = new Q5();
		button.click();
		button.access();
	}
}

interface Clickable {
	default void click() {
		System.out.println("click");
	}
}

interface Accessible {
	default void access() {
		System.out.println("access");
	}
}
