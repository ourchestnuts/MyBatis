package test.src.org.lanqiao.web.crud.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



import main.src.org.lanqiao.web.crud.entity.User;
import main.src.org.lanqiao.web.crud.service.UserService;

public class UserServiceTest {
	private static UserService userService;
	@BeforeClass
	public static void setup(){
		if(userService==null){
			userService=new UserService();
		}
	}
	@AfterClass
	public static void down(){
		userService=null;
	}
	
	

	@Test
	public void test() {
		
		for(int i=0;i<50;i++){
			User user=new User();
			user.setId(i);
			user.setName(getString(5));
			user.setAge((int)Math.round(Math.random()*25));
			user.setRoleId(2);
			user.setActive(true);
			user.setEmail(getString(9)+".com");
			userService.insertUser(user);
		}
	}
	@Test
	public void testfindAll() {
		
		List<User>users=userService.findAll();
		for (User user : users) {
			System.out.println(user);
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
