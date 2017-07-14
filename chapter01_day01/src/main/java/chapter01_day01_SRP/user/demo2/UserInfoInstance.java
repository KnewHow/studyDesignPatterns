package chapter01_day01_SRP.user.demo2;

public class UserInfoInstance implements UserInfo {

	@Override
	public void setUserId(String uid) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUserName() {
		System.out.println("run getUserName method");
		return null;
	}

	@Override
	public boolean changePassword(String oldPass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser() {
		System.out.println("run deleteUser method");
		return false;
	}

	@Override
	public boolean addOrg(int orgID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRole(int roleID) {
		// TODO Auto-generated method stub
		return false;
	}

}
