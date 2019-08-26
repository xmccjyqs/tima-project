package com.nuo.timaapi.api;

import com.nuo.timadomain.TimaStudent;

public interface TimaStudentFeignService {

   TimaStudent findTimaStudentBYId(Integer id);
}
