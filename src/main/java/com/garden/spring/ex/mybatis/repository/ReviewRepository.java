package com.garden.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.garden.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// 전달 받은 id 와 일치하는 행 조회
	public Review slectReview(@Param("id") int id);

}
