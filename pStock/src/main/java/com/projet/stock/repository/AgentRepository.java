package com.projet.stock.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Agent;
@Repository
public interface AgentRepository extends JpaRepository<Agent, Long>{

	@Query(nativeQuery=true,value="select nom,mat,sysdate from agent")
	List<Object> getAgentWithDate();
}
