package com.mfu.projectenterprise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyingRespository extends JpaRepository<BookCourse, Long> {

  List<BookCourse> findById(long id);

}
