package com.garden.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.spring.ex.mybatis.domain.Review;
import com.garden.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// 전달 받은 id 와 일치하는 리뷰 정보 리턴 기능
	public Review getReview(int id) {
		// new_review 테이블에서 전달받은 id 와 일치하는 행 조회
		Review review = reviewRepository.slectReview(id);
		
		return review;
	}

}
