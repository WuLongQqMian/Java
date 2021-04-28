package cn.edu.xaut.mybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {
	
	@Test
	public void testContainer() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		String names[]=ac.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println("容器当中的名字"+name+"--"+ac.getBean(name));
		}
	}

}
