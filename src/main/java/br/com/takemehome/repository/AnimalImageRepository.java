package br.com.takemehome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.takemehome.entities.AnimalImage;

public interface AnimalImageRepository extends JpaRepository<AnimalImage, Integer> {

}
