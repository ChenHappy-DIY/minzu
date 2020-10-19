package com.chenxin.minzu.Respotity;

import com.chenxin.minzu.Enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陈鑫
 * @create 2020-10-18 21:52
 */
public interface UserRespotity extends JpaRepository<User,Integer> {
    /**
     * 可以自己增加自己的CRUD的方法，jpa中有封装好的底层操作
     * @param id
     * @return
     */
    public User findById(int id);
    public User deleteById(int id);
}
