package com.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.user.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,Integer> {

}
