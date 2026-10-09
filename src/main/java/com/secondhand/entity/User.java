package com.secondhand.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity//标记这个类是数据实体，代表是一张数据库表
@Table(name="t_user")//指定数据表名
@Data//不用手动写一些代码，会自动生成
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)//主键自增，自动生成id，不用手动赋值
    private long id;
    private String username;//用户名
    private String password;//用户密码
    private String phone;//手机号
    private String avatar;//用户头像
}
