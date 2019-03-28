package com.xiaoqi.cloud.dao;

import com.xiaoqi.cloud.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiaoqi
 * 2019-03-18
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
