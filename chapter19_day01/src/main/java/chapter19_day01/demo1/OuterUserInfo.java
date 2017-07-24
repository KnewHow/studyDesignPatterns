package chapter19_day01.demo1;

import java.util.Map;

import chapter19_day01.demo1.desigin_one.IUserInfo;
import chapter19_day01.demo1.desigin_two.OuterUser;

/**
 * This a adapter for two different design
 * 
 * @author ygh Jul 24, 2017
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

	private Map<String, String> baseInfo = super.getUserBaseInfo();
	private Map<String, String> homeInfo = super.getUseHomeInfo();
	private Map<String, String> officeInfo = super.getUserOfficeInfo();

	@Override
	public String getUserName() {
		String userName = this.baseInfo.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = this.homeInfo.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber = this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = this.officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = this.homeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
