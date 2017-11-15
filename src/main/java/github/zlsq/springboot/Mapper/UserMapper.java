package github.zlsq.springboot.Mapper;

import github.zlsq.springboot.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zlsq
 * @date 2017/11/15
 */
@Mapper
//可以不加@Repository注解,IntelliJ IDEA在Autowired的时候会报错,但本身没错
@Repository
public interface UserMapper {
    @Select("SELECT * FROM user WHERE name = #{name}")
    User selectUserByName(@Param("name") String name);

    @Insert("INSERT INTO USER(id, name, age) VALUES(uuid(), #{name}, #{age})")
    int insertUser(@Param("name") String name, @Param("age") Integer age);
}