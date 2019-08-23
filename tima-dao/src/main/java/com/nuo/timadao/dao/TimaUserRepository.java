package com.nuo.timadao.dao;

import com.nuo.timadomain.TimaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author bj
 * @Date 2019/8/14 13:55
 * @Version 1.0
 */
@Repository
public interface TimaUserRepository extends JpaRepository<TimaUser,Integer> {

    TimaUser findTimaUserById(Integer id);
}
