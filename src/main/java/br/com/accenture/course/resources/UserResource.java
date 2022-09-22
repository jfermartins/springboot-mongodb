package br.com.accenture.course.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.accenture.course.domain.User;
import br.com.accenture.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User jane = new User("1", "Jane", "jfermartins@gmail.com");
		User fernanda = new User("2", "Fernanda", "fernanda@gmail.com");
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
