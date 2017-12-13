

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1036.kuis_1036.controller;

import com.kuis_1036.kuis_1036.entity.ipk_1036;
import com.kuis_1036.kuis_1036.service.IpkService;
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
@RequestMapping("/ipk_1036")
public class IpkController {

    @Autowired
    private IpkService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public ipk_1036 insert(@RequestBody ipk_1036 ipk_1036) {
        return categoryService.insert(ipk_1036);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk_1036 update(@RequestBody ipk_1036 ipk_1036) {
        return categoryService.update(ipk_1036);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return categoryService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ipk_1036 getById(@PathVariable("id") Long id){
        return categoryService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk_1036> getAll(){
        return categoryService.getAll();
    }
}
