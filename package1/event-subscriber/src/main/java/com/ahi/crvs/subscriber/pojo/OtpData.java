package com.ahi.crvs.subscriber.pojo;

public class OtpData {
	private String uin;
	private String otp;

	public String getUin() {
		return uin;
	}

	public void setUin(String uin) {
		this.uin = uin;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public OtpData(String uin, String otp) {
		super();
		this.uin = uin;
		this.otp = otp;
	}

}
