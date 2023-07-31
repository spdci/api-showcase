package obg.spdci.pojo;

import java.util.Map;

import lombok.Data;

@Data
public class Credential {
	private String userName;
	private String password;
	private String accessToken;
	private String errorCode;
	private String errorInfo;
	private Map tokenInfo;
	private String spMisId;

}
