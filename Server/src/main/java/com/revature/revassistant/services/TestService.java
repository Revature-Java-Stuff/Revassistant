package com.revature.revassistant.services;

import com.revature.revassistant.entities.Test;
import com.revature.revassistant.repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestRepo testRepo;

    @Autowired
    public TestService(TestRepo testRepo) {
        this.testRepo = testRepo;
    }

    public void save(Test test) {
        testRepo.save(test);
    }
}
