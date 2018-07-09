/**
 * 
 */
package send.sms.service.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import send.sms.service.requests.RegisterUserRequest;
import send.sms.service.response.RegisterUserResponse;

/**
 * @author gurunath k
 *
 */

@RestController
@RequestMapping("/user")
public class RegisterUserController {
	
	 private static final String SUCCESS_STATUS = "success";
	 private static final String ERROR_STATUS = "error";
	 private static final int CODE_SUCCESS = 201;
	 private static final int CODE_FAILURE = 400;
	 
	@SuppressWarnings("unused")
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	 public RegisterUserResponse register(@RequestBody RegisterUserRequest request) 
	 {
		 RegisterUserResponse response = new RegisterUserResponse();
	 
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
