package com.garden.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.spring.ex.mybatis.domain.Review;
import com.garden.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// parameter 로 전달받은  id 와 일치하는 리뷰 정보를 json 으로 Response 에 담는다.
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {
		// request Parameter
		// request.getParameter("id");
		Review review = reviewService.getReview(id);
		
		return review;
	}

}
