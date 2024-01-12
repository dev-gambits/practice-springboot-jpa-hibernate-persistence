package cl.sideralti.hibernate;

import cl.sideralti.hibernate.service.CustomerService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringbootAssignedUuidApplication {

	private final CustomerService customerService;

	public HibernateSpringbootAssignedUuidApplication(CustomerService customerService) {
		this.customerService = customerService;
	}

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringbootAssignedUuidApplication.class, args);
	}

	@Bean
	public ApplicationRunner init() {
		return args -> {
			customerService.insertCustomer();
		};
	}
}
