package com.SpringMVC.service.impl;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.model.convert.courseConvert;
import com.SpringMVC.model.dto.CourseDTO;
import com.SpringMVC.model.entity.CourseEntity;
import com.SpringMVC.model.entity.MajorEntity;
import com.SpringMVC.repository.CourseRepository;
import com.SpringMVC.service.ICourseService;
import com.SpringMVC.service.IMajorService;
import com.SpringMVC.util.UploadFileUtils;

@Service
public class CourseService implements ICourseService {

	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private courseConvert courseConvert;
	@Autowired
	private IMajorService majorService;
	
	@Autowired
	private UploadFileUtils fileUtils; 
	
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
		byte[] decodeBase64 = Base64.getDecoder().decode(course.getBase64().getBytes());
		if(course.getId() != null) {
			CourseEntity newCourse = courseConvert.toEntity(course);
			newCourse.setMajor(majorService.findByCode(course.getMajorCode()));
			newCourse.setThumbnail(fileUtils.writeOrUpdate(decodeBase64, course.getThumbnail()));
			return courseConvert.toDTO(courseRepo.save(newCourse));
		}
		CourseEntity courseEntity = courseConvert.toEntity(course);
		courseEntity.setThumbnail(fileUtils.writeOrUpdate(decodeBase64, course.getThumbnail()));
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
	public List<CourseEntity> findListEntity(MajorEntity major) {
		List<CourseEntity> result = new ArrayList<CourseEntity>();
		for(CourseEntity i : courseRepo.findListByMajor(major)) {
			result.add(i);
		}
		return result;
	}



}
