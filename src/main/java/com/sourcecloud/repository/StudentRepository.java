package com.sourcecloud.repository;

import org.springframework.data.repository.CrudRepository;

import com.sourcecloud.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
