package br.com.takemehome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.takemehome.entities.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {

}
