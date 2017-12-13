



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1036.kuis_1036.service;

import com.kuis_1036.kuis_1036.entity.identitas_1036;
import com.kuis_1036.kuis_1036.repo.IdentitasRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Hendro Steven
 */
@Service("IdentitasService")
@Transactional
public class IdentitasService  {

       @Autowired
    private IdentitasRepo repo;

    public identitas_1036 insert(identitas_1036 admin) {
        return repo.save(admin);
    }
    
    public identitas_1036 update(identitas_1036 admin) {
        return repo.save(admin);
    }
    
    public boolean delete(String id){
        repo.delete(id);
        return true;
    }
    
    public identitas_1036 getById(String id){
        return repo.findOne(id);
    }
    
    public List<identitas_1036> getAll(){
        return repo.findAllIdentitas();
    }
}
