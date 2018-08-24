package com.self.mapper;


import com.self.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper{

     @Select("select * from user")
        public List<User> findUserByName();
//
//        @Insert("insert into user(username,password) values(#{username},#{password})")
//        public void addUser(User user);

   public List<User> findUser();

   public void addUser(User user);

   public void updateUser(int id);


   public void deleteUser(int id);
}
