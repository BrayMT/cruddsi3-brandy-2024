package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cDelivery;

public interface iDeliveryService {

    public List<cDelivery> find();
    public Optional<cDelivery> findById(int id);
    public int save(cDelivery obj);
    public void delete(int id);
    
}