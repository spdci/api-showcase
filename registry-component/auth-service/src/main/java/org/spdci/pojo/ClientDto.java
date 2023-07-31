package org.spdci.pojo;


import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class ClientDto {
	private String realM;
	private String clientId;
	private String grantType;
	private String clientSecret;
	

	public ClientDto(String realM, String clientId, String grantType, String clientSecret) {
		super();
		this.realM = realM;
		this.clientId = clientId;
		this.grantType = grantType;
		this.clientSecret = clientSecret;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getUrl() {
		return "/auth/realms/" + this.realM + "/protocol/openid-connect/token";
	}

	public String getRealM() {
		return realM;
	}

	public void setRealM(String reamM) {
		this.realM = reamM;
	}

	public MultiValueMap<String, String> getBodyParams(Credential credential) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("client_id", this.clientId);
		map.add("grant_type", this.grantType);
		map.add("client_secret", this.clientSecret);
		map.add("username", credential.getUserName());
		map.add("password", credential.getPassword());

		return map;
	}

}
