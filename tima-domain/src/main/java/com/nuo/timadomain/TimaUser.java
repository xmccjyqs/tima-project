package com.nuo.timadomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.dialect.Ingres9Dialect;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author bj
 * @Date 2019/8/14 13:51
 * @Version 1.0
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tima_user")
public class TimaUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;

}
