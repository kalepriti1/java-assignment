package com.stackroute.newz.service;

import com.stackroute.newz.model.News;
import com.stackroute.newz.repository.NewsRepository;
import com.stackroute.newz.util.exception.NewsAlreadyExistsException;
import com.stackroute.newz.util.exception.NewsNotExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*
 * This class is implementing the NewsService interface. This class has to be annotated with 
 * @Service annotation.
 * @Service - is an annotation that annotates classes at the service layer, thus 
 * clarifying it's role.
 * 
 * */
@Service
public class NewsServiceImpl implements NewsService {

	/*
	 * Autowiring should be implemented for the NewsRepository.
	 */
	@Autowired
	NewsRepository newsRepository;

	/*
	 * Add a new news. Throw NewsAlreadyExistsException if the news with specified
	 * newsId already exists.
	 */
	public News addNews(News news) throws NewsAlreadyExistsException {
		//newsRepository.getOne(news.getNewsId());
		if (newsRepository.getOne(news.getNewsId())!= null) {
			throw new NewsAlreadyExistsException("News already exists");
		}
		return newsRepository.save(news);
	}



	/*
	 * Retrieve an existing news by it's newsId. Throw NewsNotExistsException if the 
	 * news with specified newsId does not exist.
	 */
	public News getNews(int newsId) throws NewsNotExistsException {
		return newsRepository.findById(newsId).orElseThrow(()-> new NewsNotExistsException());
	}

	/*
	 * Retrieve all existing news
	 */
	public List<News> getAllNews() {
		return newsRepository.findAll();
	}

	
	/*
	 * Update an existing news by it's newsId. Throw NewsNotExistsException if the 
	 * news with specified newsId does not exist.
	 */
	public News updateNews(News news) throws NewsNotExistsException {
		if (newsRepository.getOne(news.getNewsId())!= null) {
			return newsRepository.saveAndFlush(news);
		}
		throw new NewsNotExistsException();
	}

	/*
	 * Delete an existing news by it's newsId. Throw NewsNotExistsException if the 
	 * news with specified newsId does not exist.
	 */
	public boolean deleteNews(int newsId) throws NewsNotExistsException {
		if (newsRepository.getOne(newsId) != null) {
			newsRepository.deleteById(newsId);
		}
		else {
			throw new NewsNotExistsException();
		}
		return false;
	}

}
