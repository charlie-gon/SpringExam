package com.company.movie.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {
	
	@Autowired com.company.movie.MovieAPI movieAPI;
	
	/*
	 * @ResponseBody 
 		- 자바 객체를 HTTP 응답 몸체로 전송함
 		- 자바 객체를 HTTP 요청의 body 내용으로 매핑하는 역할
		출처: https://lee-mandu.tistory.com/242 [개발/일상_Mr.lee]
	 */

	
	// 문제4
	// 영화코드 20205144 감독정보 조회
	@RequestMapping("/movieDirectorInfo")
	@ResponseBody
	public List<String> movieActor(){
		List<String> list = new ArrayList<>();
		Map map = movieAPI.getMovieInfo();
		Map movieInfoResult = (Map) map.get("movieInfoResult");
		Map movieInfo = (Map) movieInfoResult.get("movieInfo");
		List<Map> directors = (List<Map>) movieInfo.get("directors");
		
		for(Map peopleNm : directors) {
			list.add((String) peopleNm.get("peopleNm"));
		}
		return list;
	}
}
	
	