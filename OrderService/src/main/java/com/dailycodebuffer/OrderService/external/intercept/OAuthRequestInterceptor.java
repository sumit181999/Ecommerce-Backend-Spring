package com.dailycodebuffer.OrderService.external.intercept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class OAuthRequestInterceptor implements RequestInterceptor {

	@Autowired
	private OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;

	@Override
	public void apply(RequestTemplate template) {
		// TODO Auto-generated method stub
		template.header("Authorization",
				"Bearer " + oAuth2AuthorizedClientManager.authorize(OAuth2AuthorizeRequest
						.withClientRegistrationId("internal-clinet").principal("internal").build()).getAccessToken()
						.getTokenValue());
//		here principal means scope and clientRegisterationId you will get in application.yaml file
	}

}
