package com.chenxin.minzu.Enity;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;
import java.security.PrivateKey;

/**
 * @author 陈鑫
 * @create 2020-10-19 18:16
 */
@Entity
@Table(name = "national_main")
public class NationalMain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //private Integer type_id;
    //民族名字
    private String national_name;
    //民族描述
    private String national_depict;
    //民族人口
    private Integer national_popluace;
    //民族历史
    private String national_history;
    //民族分布
    private String national_scatter;
    //民族文化
    private String national_literature;
    //民族科学
    private String national_sience;
    //民族艺术
    private String national_art;
    //民族习俗
    private String national_convention;

    //@OneToOne(mappedBy = "national_main",fetch = FetchType.LAZY)
    //private NationalType nationalType;
    //
    //public NationalType getNationalType() {
    //    return nationalType;
    //}
    //
    //public void setNationalType(NationalType nationalType) {
    //    this.nationalType = nationalType;
    //}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getNational_name() {
        return national_name;
    }

    public void setNational_name(String national_name) {
        this.national_name = national_name;
    }

    public String getNational_depict() {
        return national_depict;
    }

    public void setNational_depict(String national_depict) {
        this.national_depict = national_depict;
    }

    public Integer getNational_popluace() {
        return national_popluace;
    }

    public void setNational_popluace(Integer national_popluace) {
        this.national_popluace = national_popluace;
    }

    public String getNational_history() {
        return national_history;
    }

    public void setNational_history(String national_history) {
        this.national_history = national_history;
    }

    public String getNational_scatter() {
        return national_scatter;
    }

    public void setNational_scatter(String national_scatter) {
        this.national_scatter = national_scatter;
    }

    public String getNational_literature() {
        return national_literature;
    }

    public void setNational_literature(String national_literature) {
        this.national_literature = national_literature;
    }

    public String getNational_sience() {
        return national_sience;
    }

    public void setNational_sience(String national_sience) {
        this.national_sience = national_sience;
    }

    public String getNational_art() {
        return national_art;
    }

    public void setNational_art(String national_art) {
        this.national_art = national_art;
    }

    public String getNational_convention() {
        return national_convention;
    }

    public void setNational_convention(String national_convention) {
        this.national_convention = national_convention;
    }
}
