package com.company.movie;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieAPI {
	
	public Map getMovieInfo() {
		
		String movieCd = "20205144";
		String reqURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=f5eef3421c602c6cb7ea224104795888&movieCd="+movieCd;
		
		RestTemplate restTemp = new RestTemplate();
		return restTemp.getForObject(reqURL, Map.class);
	}
}

