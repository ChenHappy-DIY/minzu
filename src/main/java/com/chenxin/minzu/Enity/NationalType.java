package com.chenxin.minzu.Enity;

import javax.persistence.*;

/**
 * @author 陈鑫
 * @create 2020-10-19 17:59
 */
@Entity
@Table(name = "national_type")
public class NationalType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nationaltype;
    //@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    //@JoinColumn(name = "national_type_national_main")
    //private NationalMain nationalMain;
    //
    //public NationalMain getNationalMain() {
    //    return nationalMain;
    //}
    //
    //public void setNationalMain(NationalMain nationalMain) {
    //    this.nationalMain = nationalMain;
    //}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNationaltype() {
        return nationaltype;
    }

    public void setNationaltype(String nationaltype) {
        this.nationaltype = nationaltype;
    }
}
