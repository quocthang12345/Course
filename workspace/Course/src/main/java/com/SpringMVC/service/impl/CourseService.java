package com.SpringMVC.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.courseConvert;
import com.SpringMVC.model.convert.userConvert;
import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.dto.UserDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.MajorEntity;
import com.SpringMVC.model.entity.UserEntity;
import com.SpringMVC.repository.CourseRepository;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IMajorService;

@Service
public class CourseService implements ICourseService {

	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private courseConvert courseConvert;
	@Autowired
	private IMajorService majorService;
	
	@Autowired
	private userConvert userConverter;
	
	@Override
	public List<CourseDTO> findList(String key) {
		List<CourseDTO> result = new ArrayList<CourseDTO>();
		if(key != null) {
			for(CourseEntity course : courseRepo.search(key)) {
				result.add(courseConvert.toDTO(course));
			}
			return result;
		}
		for(CourseEntity course : courseRepo.findAll()) {
			result.add(courseConvert.toDTO(course));
		}
		return result;
	}

	@Override
	public CourseDTO findOne(Long id) {
		return courseConvert.toDTO(courseRepo.findOne(id));
	}

	@Override
	@Transactional
	public CourseDTO Update(CourseDTO course) {
		if(course.getId() != null) {
			CourseEntity newCourse = courseConvert.toEntity(course);
			newCourse.setMajor(majorService.findByCode(course.getMajorCode()));
			return courseConvert.toDTO(courseRepo.save(newCourse));
		}
		CourseEntity courseEntity = courseConvert.toEntity(course);
		courseEntity.setMajor(majorService.findByCode(course.getMajorCode()));
		return courseConvert.toDTO(courseRepo.save(courseEntity));
	}

	@Override
	public CourseEntity findOneById(Long id) {
		return courseRepo.findOne(id);
	}

	@Override
	@Transactional
	public void Delete(Long[] ids) {
		for(Long id : ids) {
			courseRepo.delete(id);
		}	
	}

	@Override
	@Transactional
	public CourseDTO addUserInCourse(UserDTO user,CourseDTO course) {
		UserEntity userEntity = userConverter.toEntity(user);
		CourseEntity courseEntity = courseConvert.toEntity(course);
		List<UserEntity> checkUserInCourse = courseRepo.getUserInCourse(course.getId());
		if(checkUserInCourse.contains(userEntity)) {
			return null;
		}else {
			courseEntity.getUsers().add(userEntity);
			userEntity.getCourses().add(courseEntity);
		}
		return courseConvert.toDTO(courseRepo.save(courseEntity));
	}

	@Override
	public List<CourseEntity> findListEntity(MajorEntity major) {
		List<CourseEntity> result = new ArrayList<CourseEntity>();
		for(CourseEntity i : courseRepo.findListByMajor(major)) {
			result.add(i);
		}
		return result;
	}

	@Override
	public List<UserEntity> getListByCourse(CourseEntity course) {
		if(course != null) {
		List<UserEntity> result = new ArrayList<UserEntity>();
		for(UserEntity i : courseRepo.getUserInCourse(course.getId())) {
			result.add(i);
		}
		return result;
		}
		return null;
	}

}
