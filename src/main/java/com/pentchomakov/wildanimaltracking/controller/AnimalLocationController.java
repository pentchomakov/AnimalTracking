package com.pentchomakov.wildanimaltracking.controller;

import java.util.HashMap;
import java.util.Map;

import com.pentchomakov.wildanimaltracking.SpringJDBCConfiguration;
import com.pentchomakov.wildanimaltracking.dao.AnimalDAO;
import com.pentchomakov.wildanimaltracking.model.Animal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalLocationController {

    /** Retrieves the latest locations of all animals
     */
    @RequestMapping(value = "/animallocationall")
    public ResponseEntity<Object> getAllLocations() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringJDBCConfiguration.class);


        Animal animal = null;
        AnimalDAO animalDAO = (AnimalDAO) applicationContext.getBean("animalDAO");
        String animalName = animalDAO.findAnimalById(1);
        applicationContext.close();

        return new ResponseEntity<>(animalName, HttpStatus.OK);
    }

    /** Retrieves all the locations of a certain animal
    /* @param animal_id (int)
    /* @param start_date (string: dd-MM-yyyy, optional)
    /* @param end_date (string: dd-MM-yyyy, optional)
     */
    @RequestMapping(value = "/")
    public ResponseEntity<Object> getSpecificAnimalLocations() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
