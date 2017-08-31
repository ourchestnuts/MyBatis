package main.src.org.lanqiao.web.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;



import com.sun.org.apache.bcel.internal.generic.Select;

import main.src.org.lanqiao.web.crud.entity.User;

public interface UserMapper {


  /*@SuppressWarnings("deprecation")
  public List<User> findAll(int page, int limit) {
    String query = "select id ,  name ,  age ,email ,birthday ,salary ,is_active as active,role_id"
        + " from crud_user limit ?,?";
    return op.queryForList(query, new UserMapper(), (page-1)*limit, limit);
  }
*/
	public List<User> findAll();
  public void insertUser(User user);
   /* String sql = "INSERT INTO crud_user"
        + "(name, age, email, head, head_url, birthday, salary, gmt_create, gmt_modified, is_active, role_id) "
        + "VALUES(?,?,?,? ,? ,?,?,now(),now(),?,?)";

    op.execute(sql, user.getName(), user.getAge(), user.getEmail(),
        user.getHead(), user.getHeadUrl(), user.getBirthday(),
        user.getSalary(), user.isActive(), user.getRoleId());
  }*/

  /*public int count(UserQuery userQuery) {
    String sql = "select count(id) from crud_user "+userQuery.toString();
    return op.queryForInt(sql);
  }
  
  @SuppressWarnings("deprecation")
public List<User> findBy(User user,int page,int limit){
    String query = "select id ,  name ,  age ,email ,birthday ,salary ,is_active as active,role_id"
        + " from crud_user "
       + user.toString()
        + " limit ?,?";
    return op.queryForList(query, new UserMapper(), (page-1)*limit, limit);
  }*/
}
