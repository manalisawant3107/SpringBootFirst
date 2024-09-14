package SpringBoot.SpringBootFirstEx;

import org.springframework.stereotype.Component;

@Component

public class X {

	
	X() {
		System.err.println("I am in x const");
	}
	
	void m1() {
		System.out.println("X - m1");
	}
}
