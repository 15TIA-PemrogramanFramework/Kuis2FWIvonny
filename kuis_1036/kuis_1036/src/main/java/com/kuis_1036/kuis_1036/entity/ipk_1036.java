/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1036.kuis_1036.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC-3-320
 */
   @Entity
@Table(name = "ipk_1036")
public class ipk_1036 implements Serializable {    

    @Id
    private Long id;
   
    @Column(length = 255, nullable = true)
    private String nim;
    
    @Column(length = 255, nullable = true)
    private String tahun;
    
    @Column(length = 255, nullable = true)
    private String ipk;
      
    @Column(length = 255, nullable = true)
    private String predikat;
    
    
    @ManyToOne
    private identitas_1036 identitas;
    
    
    
     public Long getId() {
        return id;
    }

   
    public void setId(Long id) {
        this.id = id;
    }
    

    public String getNim() {
        return nim;
    
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTahun() {
        return tahun;
    
    }
    
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
     public String getIpk() {
        return ipk;
    
    }
    
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }
    
    
     public String getPredikat() {
        return predikat;
    
    }
    
    public void setPredikat(String predikat) {
        this.predikat = predikat;
    }
    
    public identitas_1036 getIdentitas(){
        return identitas;
    }
    public void setIdentitas(identitas_1036 identitas){
        this.identitas=identitas;
    }

    /**
     * @return the name
     */
    
}
   
