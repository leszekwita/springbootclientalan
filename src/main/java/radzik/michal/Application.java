package radzik.michal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@EnableAutoConfiguration
@ComponentScan(basePackages = "radzik.michal", excludeFilters = @ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
