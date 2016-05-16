package br.com.dsgti.dao;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.dsgti.entity.User;

public interface UserDao extends Dao<User, Long>, UserDetailsService {

	User findByName(String name);

}