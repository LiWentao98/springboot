package com.item_bank.springboot;

import com.item_bank.springboot.service.user.UserServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {
    @Autowired
    UserServiceImpl userService;

//	@Test
//	public void testLoginService() {
//		HashMap data = userService.teacherLogin("222222222", "222222");
//		System.out.println(data);
//	}

}
