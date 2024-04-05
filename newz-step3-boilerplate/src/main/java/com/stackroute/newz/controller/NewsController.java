package com.stackroute.newz.controller;

import com.stackroute.newz.model.News;
import com.stackroute.newz.service.NewsService;
import com.stackroute.newz.util.exception.NewsAlreadyExistsException;
import com.stackroute.newz.util.exception.NewsNotExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news")

public class NewsController {
	@Autowired
	NewsService newsService;

	@GetMapping("/api/v1/news")
	public ResponseEntity<List<News>> getHandler() {
		return new ResponseEntity<>(newsService.getAllNews(),HttpStatus.OK);
	}

	@GetMapping("/api/v1/news/{newsId}")
	public ResponseEntity<News> getNewsById(@PathVariable int newsId) throws NewsNotExistsException {
		return new ResponseEntity<>(newsService.getNews(newsId),HttpStatus.NOT_FOUND);
	}

	@PostMapping("/api/v1/news")
	public ResponseEntity<News> saveNews(@RequestBody News news) throws NewsAlreadyExistsException {
		return new ResponseEntity<>(newsService.addNews(news),HttpStatus.CONFLICT);
	}

	@PutMapping("/api/v1/news/{newsId}")
	public ResponseEntity<News> updateNews(@RequestBody News news) throws NewsNotExistsException {
		return new ResponseEntity<>(newsService.updateNews(news),HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/api/v1/news/{newsId}")
	public ResponseEntity<String> removeNews(@PathVariable int newsId) throws NewsNotExistsException {
		if (newsService.deleteNews(newsId)) {
			return new ResponseEntity<>("News deleted successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("News not found", HttpStatus.NOT_FOUND);
		}
	}
}
