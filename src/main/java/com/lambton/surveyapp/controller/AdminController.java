/**
 * 
 */
package com.lambton.surveyapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lambton.surveyapp.service.AdminService;
import com.lambton.surveyapp.service.SurveyService;
import com.lambton.surveyapp.view.models.AdminAnalyticsVO;
import com.lambton.surveyapp.view.models.SearchResultVO;
import com.lambton.surveyapp.view.models.SurveyResponseVO;
import com.lambton.surveyapp.view.models.SurveyVO;

/**
 * @author Jency Jose-C0783516
 * @Since Jun 5, 2021 11:11:05 AM
 *
 */

@RestController
@CrossOrigin("http://surveyapp.ap-south-1.elasticbeanstalk.com")
@RequestMapping("/surveyapp")
public class AdminController {

	@Autowired
	private SurveyService surveyService;

	@Autowired
	private AdminService adminService;

	@GetMapping("/survey/all/upcoming")
	public List<SurveyVO> findAllSurveys() {
		return surveyService.getAllBeforeStartDate();
	}

	@GetMapping("/survey/all/active")
	public List<SurveyVO> findAllActiveSurveys() {
		return surveyService.getAllBeforeEndDate();
	}

	@GetMapping("/survey/all")
	public List<SurveyVO> findAll() {
		return surveyService.getAll();
	}

	@GetMapping("/survey/search")
	public SearchResultVO<SurveyVO> findAllSurveys(@RequestParam Map<String, String> params) {
		return surveyService.search(params);
	}

	@GetMapping("/survey/get")
	public SurveyVO getSurvey(@RequestParam String surveyId) {
		return surveyService.findOne(surveyId);
	}

	@GetMapping("/survey/getresponse")
	public List<SurveyResponseVO> getSurveyResponses(@RequestParam String surveyId) {
		return surveyService.findSurveyResponses(surveyId);
	}

	@PostMapping("/survey/create")
	public SurveyVO createSurvey(@RequestBody SurveyVO surveyVO) {
		return surveyService.save(surveyVO);
	}

	@PostMapping("/survey/update")
	public SurveyVO updateSurvey(@RequestBody SurveyVO surveyVO) {
		return surveyService.update(surveyVO);
	}

	@PostMapping("/survey/delete")
	public Void deleteSurvey(@RequestBody SurveyVO surveyVO) {
		return surveyService.delete(surveyVO);
	}

	@GetMapping("/admin/anylytics")
	public AdminAnalyticsVO getAdminAnalytics() {
		return adminService.getAdminAnalytics();
	}
}
