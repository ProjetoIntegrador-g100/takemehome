package br.com.takemehome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.takemehome.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
