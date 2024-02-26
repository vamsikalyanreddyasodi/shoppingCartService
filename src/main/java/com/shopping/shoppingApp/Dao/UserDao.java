package com.shopping.shoppingApp.Dao;

import com.shopping.shoppingApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

}
