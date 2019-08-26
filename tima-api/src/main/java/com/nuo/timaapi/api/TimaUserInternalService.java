package com.nuo.timaapi.api;

import com.nuo.timadomain.TimaUser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author bj
 * @Date 2019/8/14 14:08
 * @Version 1.0
 */
@RequestMapping("internal")
public interface TimaUserInternalService {

    @RequestMapping("user/id/{id}")
    TimaUser findTimaUserById(@PathVariable Integer id);

}
