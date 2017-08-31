package main.src.org.lanqiao.web.crud.entity;




public class UserWithRole extends User {
	private String roleName;
	private Integer roleId;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "UserWithRole [roleName=" + roleName + ", roleId=" + roleId + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + ", getBirthday()="
				+ getBirthday() + ", getSalary()=" + getSalary() + ", isActive()=" + isActive() + ", toString()="
				+ super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}
  

}
