package study;

public class Run {
	public static void main(String[] args) {
		new GrandChild();
		System.out.println(Parent.count);
	}
}

class Parent {
	static int count = 10;
	int data = 1;

	public Parent() {
		count += data;
		mutate();
	}

	public void mutate() {
		count += 1;
	}
}

class Child extends Parent {
	int data = 20;

	public Child() {
		data += 5;
		count += this.data;
		mutate();
	}

	@Override
	public void mutate() {
		count += data;
	}
}

class GrandChild extends Child {
	int data = 50;

	public GrandChild() {
		count += super.data;
		mutate();
	}

	@Override
	public void mutate() {
		count += this.data / 10;
	}
}