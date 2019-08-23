package com.nuo.timadao.dao;

import com.nuo.timadomain.TimaStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimaStudentRepository extends JpaRepository<TimaStudent,Integer> {

    TimaStudent findTimaStudentById(Integer id);
}
