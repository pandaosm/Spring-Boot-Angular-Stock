package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Lflivr;
@Repository
public interface LflivrRepository extends JpaRepository<Lflivr, Long>{

}