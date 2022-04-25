package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {
 void add(User user);
 void delete(User user);
 void update(User user);
 List<User> getAll();
 void getById(int id);
 boolean getEmail(String email);
 boolean getPassword(String password);
}
