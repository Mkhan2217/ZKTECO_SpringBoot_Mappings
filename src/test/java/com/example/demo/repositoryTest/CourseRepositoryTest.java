package com.example.demo.repositoryTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.CourseRepository;

@SpringBootTest
public class CourseRepositoryTest {
	@Autowired
	private CourseRepository courseRepository;
	

}
