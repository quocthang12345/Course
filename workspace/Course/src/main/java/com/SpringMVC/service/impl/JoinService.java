package com.SpringMVC.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.courseConvert;
import com.SpringMVC.model.convert.joinConvert;
import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.dto.JoinDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.JoinEntity;
import com.SpringMVC.model.entity.UserEntity;
import com.SpringMVC.repository.JoinRepository;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IJoinService;

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
			/*select ra 1 mảng biginteger */
//			CourseDTO course = courseService.findOne(courseID);
//			result.add(course);
		}
		return result;
	}

}
