package com.ct.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.react.model.Engine;

@Repository
public interface EngineRepository extends JpaRepository<Engine, Long>
{

}
