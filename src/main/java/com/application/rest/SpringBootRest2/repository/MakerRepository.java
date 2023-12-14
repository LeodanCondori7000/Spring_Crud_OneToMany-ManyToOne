package com.application.rest.SpringBootRest2.repository;

import com.application.rest.SpringBootRest2.entities.Maker;
import com.application.rest.SpringBootRest2.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface MakerRepository extends CrudRepository<Maker,Long> {
}
