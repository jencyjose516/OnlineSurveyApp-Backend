/**
 * 
 */
package com.lambton.surveyapp.view.models;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Chinju Babu
 * @Since Jul 18, 2021 3:55:43 PM
 *
 */

@Getter
@Setter
public class MostActiveUserVO {
	
	private String user;
	private Long noOfSurveysAttended;

}
