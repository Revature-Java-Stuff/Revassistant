package com.revature.revassistant.repositories;

import com.revature.revassistant.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer> {
    /*
    Extending the CrudRepository (by way of JpaRepository) should
    implement the following CRUD operations for us:
        save()
        saveAll()
        findById()
        existsById()
        findAll()
        findAllById()
        count()
        deleteById()
        delete()
        deleteAll()
    */
}
