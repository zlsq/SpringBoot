package github.zlsq.springboot;

import github.zlsq.springboot.Entity.User;
import github.zlsq.springboot.Mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    //用@Rollback注解已无法回滚
    @Transactional
    public void selectUserByName() throws Exception {
        userMapper.insertUser("Jack", 22);
        User u = userMapper.selectUserByName("Jack");
        Assert.assertEquals(22, u.getAge().intValue());
    }


}
