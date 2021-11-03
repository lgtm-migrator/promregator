package org.cloudfoundry.promregator.config;

public class OAuth2XSUAAAuthenticationConfiguration {
	private String url;

	private String certUrl;

	private String credential_type;

	private String client_id;

	private String client_secret;

	private String client_certificates;

	private String client_key;

	private String scopes;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCertUrl() {
		return certUrl;
	}

	public void setCertUrl(String certUrl) {
		this.certUrl = certUrl;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public void setCredential_type(String credential_type) {
		this.credential_type = credential_type;
	}

	public String getCredential_type() {
		return credential_type;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_certificates(String client_certificates) {
		this.client_certificates = client_certificates;
	}

	public String getClient_certificates() {
		return this.client_certificates;
	}

	public void setClient_key(String client_key) {
		this.client_key = client_key;
	}

	public String getClient_key() {
		return this.client_key;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getScopes() {
		return scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
	}

}
