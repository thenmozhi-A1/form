package com.example.form;

import com.example.form.entity.SubscriptionForm;
import com.example.form.repository.SubscriptionFormRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FormApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(SubscriptionFormRepository repository) {
		return args -> {
			System.out.println("--- Saving Example Data to Database ---");
			SubscriptionForm form = new SubscriptionForm();
			form.setDate("2026-04-18");
			form.setCity("Test City");
			form.setCompanyName("Example Corp");
			form.setContactPerson("John Doe");
			form.setEmailId("john.doe@example.com");
			form.setPhone("1234567890");
			form.setGrandTotal("5000");
			form.setAdditionalPlans(List.of("SEO", "Hosting"));
			
			repository.save(form);
			System.out.println("--- Example Data Saved Successfully! ---");
			
			System.out.println("--- Retrieving Saved Data ---");
			repository.findAll().forEach(f -> System.out.println("Found in DB: " + f.getCompanyName() + " - " + f.getEmailId()));
		};
	}
}
