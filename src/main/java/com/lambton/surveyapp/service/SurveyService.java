/**
 * 
 */
package com.lambton.surveyapp.service;

import java.util.List;

import com.lambton.surveyapp.view.models.SurveyResponseVO;
import com.lambton.surveyapp.view.models.SurveyVO;

/**
 * @author Harini Sivakumar
 * @Since Jun 5, 2021 11:14:04 AM
 *
 */
public interface SurveyService extends CommonService<SurveyVO> {

	List<SurveyVO> getAllBeforeEndDate();

	List<SurveyVO> getAllBeforeStartDate();

	/**
	 * @param surveyId
	 * @return
	 */
	List<SurveyResponseVO> findSurveyResponses(String surveyId);

}
