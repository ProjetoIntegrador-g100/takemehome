package br.com.takemehome.security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.takemehome.entities.Customer;
import br.com.takemehome.repository.CustomerRepository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Customer customer = customerRepository.findByEmail(email);

		if (customer == null) {
			throw new UsernameNotFoundException("Usuário não encontrado!");
		}
		return customer;

	}

}
