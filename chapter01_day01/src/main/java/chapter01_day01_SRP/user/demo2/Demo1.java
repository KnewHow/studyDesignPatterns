package chapter01_day01_SRP.user.demo2;

public class Demo1 {
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfoInstance();
		UserBO userBO = userInfo;
		userBO.getUserName();
		
		UserBiz userBiz = userInfo;
		userBiz.deleteUser();
	}
}
