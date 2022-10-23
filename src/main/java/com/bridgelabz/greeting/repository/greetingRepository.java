package com.bridgelabz.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.greeting.model.greetingModel;

@Repository
public interface greetingRepository extends JpaRepository<greetingModel, Integer> {

}
