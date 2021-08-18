/**
 * 
 */
package com.lambton.surveyapp.view.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Chinju Babu
 * @Since Jun 5, 2021 11:04:12 AM
 *
 */

@Getter
@Setter
public class QuestionVO {
	
	private String uniqueId;
	
	private String answerType;
	
	private String question;
	
	private String description;
	
	List<String> optionItems;
}
