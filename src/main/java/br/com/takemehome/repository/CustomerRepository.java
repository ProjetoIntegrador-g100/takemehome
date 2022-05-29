package br.com.takemehome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.takemehome.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	Customer findByEmail(String email);

}
