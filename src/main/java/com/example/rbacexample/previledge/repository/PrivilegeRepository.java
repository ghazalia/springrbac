package com.example.rbacexample.previledge.repository;

import com.example.rbacexample.previledge.model.Privilege;
import org.springframework.data.repository.CrudRepository;

public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {

    Privilege findByName(String name);

    @Override
    void delete(Privilege role);
}
