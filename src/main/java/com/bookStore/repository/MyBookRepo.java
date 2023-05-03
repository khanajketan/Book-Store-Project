package com.bookStore.repository;

import com.bookStore.entity.MyBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookRepo extends JpaRepository<MyBooks, Integer> {
}
