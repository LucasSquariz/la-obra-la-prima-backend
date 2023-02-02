package com.example.laobralaprima.models.repository;

import com.example.laobralaprima.models.entities.Masterpiece;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MasterpieceRepository extends MongoRepository<Masterpiece, String> {
    List<Masterpiece> findByMasterpieceName(String masterpieceName);
}
