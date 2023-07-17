package com.springProject_ms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProject_ms.Model.BookAppoint;



@Repository
public interface BookAppoint_repo extends JpaRepository<BookAppoint, Integer>{

	BookAppoint save(BookAppoint regist);

}
