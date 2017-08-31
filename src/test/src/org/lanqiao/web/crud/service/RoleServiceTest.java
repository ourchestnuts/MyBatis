package test.src.org.lanqiao.web.crud.service;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.src.org.lanqiao.web.crud.entity.Role;
import main.src.org.lanqiao.web.crud.service.RoleService;
import main.src.org.lanqiao.web.crud.service.UserService;

public class RoleServiceTest {
	private static RoleService roleService;
	@BeforeClass
	public static void setup(){
		if(roleService==null){
			roleService=new RoleService();
		}
	}
	@AfterClass
	public static void down(){
		roleService=null;
	}
	
	@Test
	public void test() {
		for(int i=0;i<20;i++){
			Role role=new Role();
			role.setId(i);
			role.setName(getString(4));
			roleService.roleInsert(role);
		}
	}
	private String getString(int length) {
		Random random=new Random();
	    StringBuffer sb=new StringBuffer();
	    for(int i=0;i<length;i++){
	       int number=random.nextInt(3);
	       long result=0;
	       switch(number){
	          case 0:
	              result=Math.round(Math.random()*25+65);
	              sb.append(String.valueOf((char)result));
	              break;
	         case 1:
	             result=Math.round(Math.random()*25+97);
	             sb.append(String.valueOf((char)result));
	             break;
	         case 2:     
	             sb.append(String.valueOf(new Random().nextInt(10)));
	             break;
	        }
	   
	     }
	     return sb.toString();
	}

}
