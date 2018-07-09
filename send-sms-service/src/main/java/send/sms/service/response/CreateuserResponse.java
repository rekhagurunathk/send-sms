/**
 * 
 */
package send.sms.service.response;

/**
 * @author gurunath k
 *
 */
public class CreateuserResponse {
	
	private String status;
	private Integer code;
	private String userName;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
