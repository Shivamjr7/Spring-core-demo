package com.shivam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shivam.springdemo.config.AppConfig;
import com.shivam.springdemo.model.Game;
import com.shivam.springdemo.model.MortalKombat;
import com.shivam.springdemo.model.UNO;

public class Application {

	public static void main(String... args) {
		// example of reading via xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Game fifa = context.getBean("fifa", Game.class);
		fifa.play();

		// reading bean configured via java configuration
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Game uno = ctx.getBean(UNO.class);
		uno.play();

		// reading @component
		Game mk = ctx.getBean("mortalKombat", MortalKombat.class);
		mk.play();

	}

}
