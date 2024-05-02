package com.tec.cruddsi3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iPlatilloService;
import com.tec.cruddsi3.interfaces.iPlatillo;

import com.tec.cruddsi3.model.cPlatillo;
@Service
public class cPlatilloService  implements iPlatilloService {

    @Autowired
    private iPlatillo data;

    @Override
    public List<cPlatillo> find(){
        return (List<cPlatillo>) data.findAll();
    }
    @Override
    public Optional<cPlatillo> findById(int id){
        return (Optional<cPlatillo>) data.findById(id);
    }
    @Override
    public int save(cPlatillo obj){
        int res=0;
        cPlatillo oPlatillo = data.save(obj);
        if(!oPlatillo.equals(null)){
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id){
        data.deleteById(id);
    }
    
}
