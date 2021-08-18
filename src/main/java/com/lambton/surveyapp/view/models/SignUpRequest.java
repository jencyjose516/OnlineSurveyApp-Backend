/**
 * 
 */
package com.lambton.surveyapp.view.models;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Chinju Babu
 * @Since Jun 16, 2021 9:08:18 PM
 *
 */

@Getter
@Setter
public class SignUpRequest {
	
	private String email;

	private String firstname;

	private String lastname;
	
	private String password;

}
