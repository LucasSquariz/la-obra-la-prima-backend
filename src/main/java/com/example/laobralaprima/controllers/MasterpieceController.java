package com.example.laobralaprima.controllers;

import com.example.laobralaprima.models.entities.Masterpiece;
import com.example.laobralaprima.models.repository.MasterpieceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/obras")
public class MasterpieceController {
    @Autowired
    MasterpieceRepository masterpieceRepository;

    @GetMapping("/getObras")
    public ResponseEntity<List<Masterpiece>> getAllMasterpiece(@RequestParam(required = false) String masterpieceName) {
        try {
            List<Masterpiece> masterpieces = new ArrayList<Masterpiece>();

            if (masterpieceName == null)
                masterpieceRepository.findAll().forEach(masterpieces::add);
            else
                masterpieceRepository.findByMasterpieceName(masterpieceName).forEach(masterpieces::add);


            if (masterpieces.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(masterpieces, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getObras/{id}")
    public ResponseEntity<Masterpiece> getMasterpieceById(@PathVariable("id") String id) {
        Optional<Masterpiece> masterpieceData = masterpieceRepository.findById(id);

        if (masterpieceData.isPresent()) {
            return new ResponseEntity<>(masterpieceData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/postObras")
    public ResponseEntity<Masterpiece> createMasterpiece(@RequestBody Masterpiece masterpiece) {
        try {
            Masterpiece _masterpiece = masterpieceRepository.save(new Masterpiece(
                    masterpiece.getId(),
                    masterpiece.getMasterpieceName(),
                    masterpiece.getMasterpieceAuthorName(),
                    masterpiece.getMasterpieceImageUrl(),
                    masterpiece.getMasterpieceDescription(),
                    masterpiece.getMasterpiecePrice(),
                    masterpiece.getMasterpieceDateCreated(),
                    masterpiece.getMasterpieceDatePosted())
            );
            return new ResponseEntity<>(_masterpiece, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteObra/{id}")
    public ResponseEntity<HttpStatus> deleteMasterpieceById(@PathVariable("id") String id) {
        try {
            masterpieceRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteObras")
    public ResponseEntity<HttpStatus> deleteAllMasterpieces() {
        try {
            masterpieceRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
