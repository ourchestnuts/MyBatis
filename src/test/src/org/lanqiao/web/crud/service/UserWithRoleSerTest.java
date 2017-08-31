package test.src.org.lanqiao.web.crud.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.src.org.lanqiao.web.crud.entity.UserWithRole;
import main.src.org.lanqiao.web.crud.service.UserWithRoleSer;

public class UserWithRoleSerTest {
	private static UserWithRoleSer userwiths;
	@BeforeClass
	public static void setup(){
		if(userwiths==null){
			userwiths=new UserWithRoleSer();
		}
	}
	@AfterClass
	public static void down(){
		userwiths=null;
	}
	@Test
	public void test() {
		List<UserWithRole> users=userwiths.findAll();
		for (UserWithRole userWithRole : users) {
			System.out.println(userWithRole);
		}
	}

}
