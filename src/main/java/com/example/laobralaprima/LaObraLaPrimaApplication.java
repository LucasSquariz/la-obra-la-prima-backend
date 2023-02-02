package com.example.laobralaprima;

import com.example.laobralaprima.models.entities.Masterpiece;
import com.example.laobralaprima.models.repository.MasterpieceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class LaObraLaPrimaApplication {
	@Autowired
	MasterpieceRepository masterpieceItemRepo;

	/*void createMasterpiece(String nome){
		masterpieceItemRepo.save(new Masterpiece(2,nome,"silva","lalala","R$1", "10/01", "10/0100"));
	}*/



	public static void main(String[] args) {
		SpringApplication.run(LaObraLaPrimaApplication.class, args);
	}
}
