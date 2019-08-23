package com.nuo.timahandler.service.impl;

import com.nuo.timadao.dao.TimaStudentRepository;
import com.nuo.timadomain.TimaStudent;
import com.nuo.timahandler.service.TimaStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimaStudentServiceImpl implements TimaStudentService {

    @Autowired
    private TimaStudentRepository studentRepository;

    @Override
    public TimaStudent findTimaStudentBYId(Integer id) {
        return studentRepository.findTimaStudentById(id);
    }
}
