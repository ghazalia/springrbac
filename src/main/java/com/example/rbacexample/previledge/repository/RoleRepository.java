package com.example.rbacexample.previledge.repository;

import com.example.rbacexample.previledge.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);
}
