package com.secondhand.repository;
import com.secondhand.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//interface是接口，不用写方法，Spring会帮我们补齐
//拥有完整的数据库方法（保存，id查询，全部查询，删除）
public interface UserRepository extends JpaRepository<User,Long>{

}
