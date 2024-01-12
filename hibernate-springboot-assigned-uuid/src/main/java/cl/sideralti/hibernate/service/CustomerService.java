package cl.sideralti.hibernate.service;

import cl.sideralti.hibernate.entity.Customer;
import cl.sideralti.hibernate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void insertCustomer() {
        Customer customer = new Customer();
       // customer.setId(UUID.randomUUID());
        customer.setAge(33);
        customer.setFirstName("Emmanuel");
        customer.setLastName("Silverado");
        customer.setAddress("Lago Villarica # 98754, Los Lagos");
        customer.setEmail("emmanuel.silverado@sideral.website");
        customer.setPhono("+4569 74176101");
        customer.setGenre("Male");
        customerRepository.save(customer);

    }
}
