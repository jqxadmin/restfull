package jqx.com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jqx.com.pojo.Student;

//@EnableAutoConfiguration
@RestController
@RequestMapping("/tvs")
public class RestFul_helloWorld {

	public static final Logger log = LoggerFactory.getLogger(RestFul_helloWorld.class);
	@GetMapping
	public List<Student> sayHello(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1L, "张三", "123", "湖南", "admin"));
		list.add(new Student(2L, "李四", "456", "广东", "admin"));
		list.add(new Student(3L, "王五", "789", "成都", "admin"));
		list.add(new Student(4L, "王二麻子", "455", "龙城", "admin"));
		return list;
	}
	
	@GetMapping(value="/{id}/image",produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage(@PathVariable int id) throws IOException {
		log.info("getImage("+id+")");
		System.out.println("id:"+id);
		String image = "src/main/resources/image/timg2.jpg";
		InputStream is = new FileInputStream(image);
		return IOUtils.toByteArray(is);
	}
}
