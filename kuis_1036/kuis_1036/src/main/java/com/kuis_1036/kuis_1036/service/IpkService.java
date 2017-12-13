


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1036.kuis_1036.service;

import com.kuis_1036.kuis_1036.entity.ipk_1036;
import com.kuis_1036.kuis_1036.repo.IpkRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("IpkService")
@Transactional
public class IpkService {


    @Autowired
    private IpkRepo repo;

    public ipk_1036 insert(ipk_1036 admin) {
        return repo.save(admin);
    }
    
    public ipk_1036 update(ipk_1036 admin) {
        return repo.save(admin);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public ipk_1036 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<ipk_1036> getAll(){
        return repo.findAllIpk();
    }
}
