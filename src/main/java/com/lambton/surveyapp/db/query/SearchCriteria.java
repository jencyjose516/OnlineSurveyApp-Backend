/**
 * 
 */
package com.lambton.surveyapp.db.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Jency Jose-C0783516
 * @Since May 16, 2021 1:55:50 PM
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SearchCriteria {
	
	private String key;
    private Object value;
    private SearchOperation operation;

}
