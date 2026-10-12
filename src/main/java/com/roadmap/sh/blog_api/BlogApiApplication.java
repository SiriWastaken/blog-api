package com.roadmap.sh.blog_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class BlogApiApplication {

	public static Map<Integer, String> data = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(BlogApiApplication.class, args);
		System.out.println("Hello");
	}

}

@RestController
class BlogPostController {

	@PostMapping("/posts")
	public BlogPost createPost(@RequestBody BlogPost post) {
		return post;
	}

}

class BlogPost {

	private Integer id;
	private String title;
	private String content;
	private String category;
	private List<String> tags;
	private Instant createdAt;
	private Instant updatedAt;

	public BlogPost() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}
}