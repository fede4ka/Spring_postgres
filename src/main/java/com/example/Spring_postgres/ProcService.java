package com.example.Spring_postgres;

import com.example.Spring_postgres.Proc;
import com.example.Spring_postgres.ProcRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcService implements ProcServiceInterface {

    @Autowired
private ProcRepository repository;

    @Override
    public List<Proc> findAll() {
        var proccessors = (List<Proc>) repository.findAll();
        return proccessors;
    }
}