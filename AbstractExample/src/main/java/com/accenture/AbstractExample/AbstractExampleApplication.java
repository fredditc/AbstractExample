package com.accenture.AbstractExample;

import com.accenture.AbstractExample.Model.Corporal;
import com.accenture.AbstractExample.Model.General;
import com.accenture.AbstractExample.Model.Military;
import com.accenture.AbstractExample.Model.Soldier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractExampleApplication.class, args);
		Corporal corporal = new Corporal("Juan");
		corporal.doJob();
		corporal.sayHello();

		Soldier soldier = new Soldier("Luis");
		soldier.doJob();

		General general =  new General("Felipe");
		general.doJob();
	}

}
