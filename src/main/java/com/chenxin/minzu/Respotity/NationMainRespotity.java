package com.chenxin.minzu.Respotity;

import com.chenxin.minzu.Enity.NationalMain;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陈鑫
 * @create 2020-10-19 18:24
 */
public interface NationMainRespotity extends JpaRepository<NationalMain,Integer> {

    public NationalMain findById(int id);

    //@Query(value = "select * from national_main where id = ?1 and national_name like ?2 ",nativeQuery = true)
    //public NationalMain findById(int id);

    //@Transactional
    //@Query(value = "select new com.chenxin.minzu.Enity.National(n.id,n.name) from NationalMain n where type_id=?1")
    //List<National> findByType_id(int id);
}
