package com.example.RJEPayload.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.RJEPayload.Entity.Rjepayload;
@Service
public interface RjePayloadRepository extends JpaRepository<Rjepayload, Integer> {

}
