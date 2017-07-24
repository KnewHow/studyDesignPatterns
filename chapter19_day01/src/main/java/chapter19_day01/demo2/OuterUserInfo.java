package chapter19_day01.demo2;

import java.util.Map;

import chapter19_day01.demo2.design_one.IUserInfo;
import chapter19_day01.demo2.design_two.IOuterUserBaseInfo;
import chapter19_day01.demo2.design_two.IOuterUserHomeInfo;
import chapter19_day01.demo2.design_two.IOuterUserOfficeInfo;

/**
 * This a adapter for two different design
 * 
 * @author ygh Jul 24, 2017
 */
public class OuterUserInfo implements IUserInfo {

	private IOuterUserBaseInfo baseInfo = null;
	private IOuterUserHomeInfo homeInfo = null;

	private IOuterUserOfficeInfo officeInfo = null;

	private Map<String, String> baseMap = null;
	private Map<String, String> homeMap = null;
	private Map<String, String> officeMap = null;

	public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
		super();
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;

		this.baseMap = this.baseInfo.getUserBaseInfo();
		this.homeMap = this.homeInfo.getUserHomeInfo();
		this.officeMap = this.officeInfo.getUserOfficeInfo();
	}

	@Override
	public String getUserName() {
		String userName = this.baseMap.get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress = this.homeMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber = this.baseMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = this.officeMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition = this.homeMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = this.homeMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
