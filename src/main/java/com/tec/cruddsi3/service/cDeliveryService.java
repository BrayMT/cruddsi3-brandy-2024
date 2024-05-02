package com.tec.cruddsi3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iDeliveryService;
import com.tec.cruddsi3.interfaces.iDelivery;

import com.tec.cruddsi3.model.cDelivery;
@Service
public class cDeliveryService  implements iDeliveryService {

    @Autowired
    private iDelivery data;

    @Override
    public List<cDelivery> find(){
        return (List<cDelivery>) data.findAll();
    }
    @Override
    public Optional<cDelivery> findById(int id){
        return (Optional<cDelivery>) data.findById(id);
    }
    @Override
    public int save(cDelivery obj){
        int res=0;
        cDelivery oDelivery = data.save(obj);
        if(!oDelivery.equals(null)){
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id){
        data.deleteById(id);
    }
    
}
    
