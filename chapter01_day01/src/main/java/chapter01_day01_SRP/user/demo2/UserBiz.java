package chapter01_day01_SRP.user.demo2;

public interface UserBiz {

	boolean changePassword(String oldPass);

	boolean deleteUser();

	boolean addOrg(int orgID);

	boolean addRole(int roleID);
}
