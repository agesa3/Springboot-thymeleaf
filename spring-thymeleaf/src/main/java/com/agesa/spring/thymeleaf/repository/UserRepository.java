package com.agesa.spring.thymeleaf.repository;

import com.agesa.spring.thymeleaf.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
