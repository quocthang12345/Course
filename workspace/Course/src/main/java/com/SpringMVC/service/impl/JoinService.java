package com.SpringMVC.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.courseConvert;
import com.SpringMVC.model.convert.joinConvert;
import com.SpringMVC.model.convert.majorConvert;
import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.dto.JoinDTO;
import com.SpringMVC.model.dto.MajorDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.JoinEntity;
import com.SpringMVC.model.entity.UserEntity;
import com.SpringMVC.repository.JoinRepository;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IJoinService;
import com.SpringMVC.service.IMajorService;

@Service
public class JoinService implements IJoinService {

	@Autowired
	private joinConvert joinConverter;
	@Autowired
	private JoinRepository joinRepo;
	@Autowired
	private courseConvert courseConverter;
	@Autowired
	private ICourseService courseService;
	@Autowired
	private IMajorService majorService;
	@Autowired
	private majorConvert majorConverter;
	
	@Override
	@Transactional
	public JoinDTO UserJoinCourse(JoinEntity join) {
		List<UserEntity> ListJoin = joinRepo.getUserJoinInCourse(join.getCourseUser());
		UserEntity userOfCourses = join.getUserCourse();
		for(int i = 0 ; i < ListJoin.size() ; i++) {
			if(ListJoin.get(i).getId() == userOfCourses.getId()) {
				return null;
			}
		}
		return joinConverter.toDTO(joinRepo.save(join));
	}

	@Override
	public JoinEntity findOneById(Long id) {
		// TODO Auto-generated method stub
		return joinRepo.findOne(id);
	}

	@Override
	public List<CourseDTO> getTopCourse(int count) {
		List<CourseDTO> result = new ArrayList<CourseDTO>();
		for(BigInteger courseID : joinRepo.getTopCourse(count)) {
			CourseDTO course = courseService.findOne(courseID.longValue());
			result.add(course);			
		}
		return result;
	}

	@Override
	public List<CourseDTO> getTopCourseInJava(int count) {
		List<CourseDTO> result = new ArrayList<CourseDTO>(count);
		MajorDTO major = majorConverter.toDTO(majorService.findByCode("Java"));
		for(BigInteger courseID : joinRepo.getTopCourseInJava()) {
			CourseDTO course = courseService.findOne(courseID.longValue());
			for(int i = 0 ; i < major.getCourse().size() ; i++) {
				if(major.getCourse().get(i).getId() == course.getId()) {
					result.add(course);
				}
			}
		}
		return result;
	}

}
