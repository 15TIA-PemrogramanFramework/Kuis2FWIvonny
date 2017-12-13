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
import javax.persistence.Table;

/**
 *
 * @author PC-3-320
 */
   @Entity
@Table(name = "identitas_1036")
public class identitas_1036 implements Serializable {    

    @Id
    private String nim;
   
     @Column(length = 255, nullable = true)
    private String jurusan;
    
    @Column(length = 255, nullable = true)
    private String nama;
    
    @Column(length = 255, nullable = true)
    private String semester;
      
    @Column(length = 255, nullable = true)
    private String tahun_masuk;
    
    
     public String getNim() {
        return nim;
    }

   
    public void setNim(String nim) {
        this.nim = nim;
    }
    

    public String getJurusan() {
        return jurusan;
    
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

   
  
    public String getNama() {
        return nama;
    
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public String getSemester() {
        return semester;
    
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
     public String getTahunmasuk() {
        return tahun_masuk;
    
    }
    
    public void setTahunmasuk(String tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }

    /**
     * @return the name
     */
    
}
   
