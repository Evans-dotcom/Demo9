package com.Kit.Demo9;

import com.Kit.Demo9.repo.UserDetailsRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.kit.Demo9")
@EnableJpaRepositories(basePackageClasses = {UserDetailsRepo.class})
public class Demo9Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo9Application.class, args);
	}

}
