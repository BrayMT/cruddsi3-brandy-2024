package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cPlatillo;

public interface iPlatilloService {

    public List<cPlatillo> find();
    public Optional<cPlatillo> findById(int id);
    public int save(cPlatillo obj);
    public void delete(int id);
    
}
