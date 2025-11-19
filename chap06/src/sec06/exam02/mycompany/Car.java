package sec06.exam02.mycompany;
import sec06.exam02.hankook.*;
import sec06.exam02.hankook.Tire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.*;

public class Car {
	
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//한국 타이어 사용
	Tire tire3 = new Tire();
	
	//금호 타이어 사용
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	
}
