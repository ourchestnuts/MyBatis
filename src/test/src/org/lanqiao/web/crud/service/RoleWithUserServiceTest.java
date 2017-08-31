package test.src.org.lanqiao.web.crud.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.src.org.lanqiao.web.crud.entity.RoleWithUser;
import main.src.org.lanqiao.web.crud.service.RoleWithUserService;

public class RoleWithUserServiceTest {
	private static RoleWithUserService rolewith;
	@BeforeClass
	public static  void setup(){
		if(rolewith==null){
			rolewith=new RoleWithUserService();
		}
	}
	@AfterClass
	public static void updown(){
		rolewith=null;
	}
	@Test
	public void test() {
		List<RoleWithUser> rows=rolewith.findAll();
		for (RoleWithUser roleWithUser : rows) {
			System.out.println(roleWithUser);
		}
	}

}
