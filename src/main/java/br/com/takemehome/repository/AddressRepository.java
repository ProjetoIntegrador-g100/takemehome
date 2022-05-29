package br.com.takemehome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.takemehome.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
