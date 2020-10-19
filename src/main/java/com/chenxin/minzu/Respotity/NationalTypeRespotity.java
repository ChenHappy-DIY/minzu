package com.chenxin.minzu.Respotity;

import com.chenxin.minzu.Enity.NationalType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陈鑫
 * @create 2020-10-19 18:13
 */
public interface NationalTypeRespotity extends JpaRepository<NationalType,Integer> {

    public NationalType findById(int id);

    
}
