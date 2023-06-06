package com.example.crudapp.models.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.crudapp.models.enums.ScentEnum;
import com.example.crudapp.models.enums.TerpeneNameEnum;

@Entity
public class Terpene extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private TerpeneNameEnum name;

    @Column
    private ScentEnum scent;
    
    @ManyToOne
    private Hop hop;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TerpeneNameEnum getName() {
        return name;
    }

    public void setName(TerpeneNameEnum name) {
        this.name = name;
    }

    public ScentEnum getScent() {
        return scent;
    }

    public void setScent(ScentEnum scent) {
        this.scent = scent;
    }

    public Hop getHop() {
        return hop;
    }

    public void setHop(Hop hop) {
        this.hop = hop;
    }

}
