package com.example.scaffolding.services;

import com.example.scaffolding.models.Dummy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {
    Dummy getDummy(Long id);

    List<Dummy> getAllDummy();

    Dummy createDummy(Dummy dummy);

    Dummy updateDummy(Dummy dummy);

    void deleteDummy(Dummy dummy);

}
