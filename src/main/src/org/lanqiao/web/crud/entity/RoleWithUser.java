package main.src.org.lanqiao.web.crud.entity;

public class RoleWithUser extends Role{
	//select u.id,u.name,age,email,role_id,r.name from user AS u right join role AS r on role_id=r.id
	private String username;
	private Integer userid;
	private String email;
	private Integer roleId;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "RoleWithUser [username=" + username + ", userid=" + userid + ", email=" + email + ", roleId=" + roleId
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
