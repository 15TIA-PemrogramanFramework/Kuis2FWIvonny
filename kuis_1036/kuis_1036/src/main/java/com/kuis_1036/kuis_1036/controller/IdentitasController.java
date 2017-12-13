/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1036.kuis_1036.controller;

import com.kuis_1036.kuis_1036.entity.identitas_1036;
import com.kuis_1036.kuis_1036.service.IdentitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/identitas_1036")
public class IdentitasController {

    @Autowired
    private IdentitasService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1036 insert(@RequestBody identitas_1036 identitas_1036) {
        return categoryService.insert(identitas_1036);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1036 update(@RequestBody identitas_1036 identitas_1036) {
        return categoryService.update(identitas_1036);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") String id) {
        return categoryService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas_1036 getById(@PathVariable("id") String id){
        return categoryService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1036> getAll(){
        return categoryService.getAll();
    }
}
