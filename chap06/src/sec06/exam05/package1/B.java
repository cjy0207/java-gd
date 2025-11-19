package sec06.exam05.package1;

public class B {

	
	//생성자
		public B() {
			//쓸 수 있는 범위가 default까지만
			A a = new A();
			a.field1 = 1;
			a.field2 = 1;
//			a.field3 = 1;
			
			a.method1();
			a.method2();
//			a.method3();
		}
	
}
