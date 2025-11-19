package sec06.exam05.package2;

import sec06.exam05.package1.A; //ctl + shif + o : import자동 정리

public class C {
	
	
	//생성자
			public C() {
				//쓸 수 있는 범위가 public만
				A a = new A();
				a.field1 = 1;
//				a.field2 = 1;
//				a.field3 = 1;
				
				a.method1();
//				a.method2();
//				a.method3();
			}

}
