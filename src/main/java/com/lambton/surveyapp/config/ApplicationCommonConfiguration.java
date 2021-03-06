/**
 * 
 */
package com.lambton.surveyapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Jency Jose-C0783516
 * @Since May 30, 2021 11:33:54 AM
 *
 */

@Configuration
public class ApplicationCommonConfiguration {

	@Bean
	PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	/*
	 * @Bean public CorsFilter corsFilter() { UrlBasedCorsConfigurationSource configSource = new
	 * UrlBasedCorsConfigurationSource(); CorsConfiguration corsConfiguration = new CorsConfiguration();
	 * corsConfiguration.setAllowCredentials(true); corsConfiguration.addAllowedOrigin("*");
	 * corsConfiguration.addAllowedHeader("*"); corsConfiguration.addAllowedMethod("GET");
	 * corsConfiguration.addAllowedMethod("POST"); configSource.registerCorsConfiguration("/**", corsConfiguration);
	 * return new CorsFilter(configSource); }
	 */

}
