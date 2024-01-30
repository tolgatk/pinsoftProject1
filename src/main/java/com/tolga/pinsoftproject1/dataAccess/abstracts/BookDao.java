package com.tolga.pinsoftproject1.dataAccess.abstracts;

import com.tolga.pinsoftproject1.entities.concrates.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {

}
