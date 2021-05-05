package cn.edu.xaut.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("myaspect")
public class MyAspect {

	public void check() {
		System.out.println("Checking");
	}
	
	public void moniter(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Start Moniter");
		jp.proceed();
		System.out.println("End Moniter");
	}
	
	public void log() {
		System.out.println("loging");
	}
	
}
