package com.nuo.timarest.controller;

import com.nuo.timadomain.TimaStudent;
import com.nuo.timahandler.service.TimaStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class TimaStudentController {

    @Autowired
    private TimaStudentService studentService;

    @RequestMapping("id/{id}")
    public TimaStudent findTimaStudentBYId(@PathVariable Integer id){
       return  studentService.findTimaStudentBYId(id);
    }
}
