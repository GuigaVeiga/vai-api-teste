package com.vai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vai.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
