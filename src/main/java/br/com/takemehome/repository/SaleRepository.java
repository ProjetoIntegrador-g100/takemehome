package br.com.takemehome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.takemehome.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
