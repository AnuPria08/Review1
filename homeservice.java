package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.home;
import com.example.demo.repository.homeRepo;


@Service
public class homeservice {
	@Autowired
	homeRepo repository;
		public String addHome(home b) 
		{
			repository.save(b);
			return  "Detail is Added";
		}
		public List<home> getHome()
		{
			return repository.findAll();
		}
		
		public String updateHome(home b)
		{
			repository.save(b);
			return " Detail is Updated ";
		}
		public String deleteHomeById(int id) {
			repository.deleteById(id);
		    return "Detail Removed";
		}
		public List<home> getHomeSorted(String field)
		{
			return repository.findAll(Sort.by(Sort.Direction.ASC, field));
		}
		public List<home> getHomeWithPagination(@PathVariable int offset, @PathVariable int pageSize)
		{
			Page<home> page=repository.findAll(PageRequest.of(offset,pageSize));
			return page.getContent();
		}
		public List<home> getHomeWithSortingAndPagination(int offset,int pageSize,String field)
		{
			Pageable paging = PageRequest.of(offset,pageSize,Sort.by(field));
			Page<home> page=repository.findAll(paging);
			return page.getContent();
		}

}