package com.marcosspano.bookstoremanager.repository;

import com.marcosspano.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
