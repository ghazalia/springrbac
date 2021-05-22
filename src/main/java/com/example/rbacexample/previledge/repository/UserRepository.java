package com.example.rbacexample.previledge.repository;

import com.example.rbacexample.previledge.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("Select u From User u where u.username = :username")
    public User getUserByUsername(@Param("username") String username);

    @Override
    void delete(User user);
}
