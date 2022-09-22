package br.com.accenture.course.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.accenture.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
