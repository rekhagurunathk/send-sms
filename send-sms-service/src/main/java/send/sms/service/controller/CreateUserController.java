/**
 * 
 */
package send.sms.service.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import send.sms.service.requests.CreateUserRequest;
import send.sms.service.response.CreateuserResponse;

/**
 * @author gurunath k
 *
 */

@RestController
@RequestMapping("/user")
public class CreateUserController {
	
	 private static final String SUCCESS_STATUS = "success";
	 private static final String ERROR_STATUS = "error";
	 private static final int CODE_SUCCESS = 201;
	 private static final int CODE_FAILURE = 400;
	 
	@SuppressWarnings("unused")
	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	 public CreateuserResponse createuser(@RequestBody CreateUserRequest request) 
	 {
		 CreateuserResponse response = new CreateuserResponse();
	 
	   String firstName = request.getFirstName();
	   String middleName = request.getMiddleName();
	   String lastName = request.getLastName();
	   String email = request.getEmailId();
	   int phone = request.getPhoneNumber();
	   String password = request.getPassword();
	   // Process the request
	   // ....
	   // Return success response to the client.
	   response.setStatus(SUCCESS_STATUS);
	   response.setCode(CODE_SUCCESS);
	  
	   /*else 
	  {
	   response.setStatus(ERROR_STATUS);
	   response.setCode(CODE_FAILURE);
	  }*/
	  return response;
	 }
	

}
