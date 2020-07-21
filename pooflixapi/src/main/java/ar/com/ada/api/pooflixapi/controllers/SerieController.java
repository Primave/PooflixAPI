package ar.com.ada.api.stephix.controllers;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ar.com.ada.api.pooflixapi.models.GenericResponse;

import ar.com.ada.api.pooflixapi.entities.*;
import ar.com.ada.api.pooflixapi.services.*;

@RestController
public class SerieController {
    
    @Autowired
    SerieService serieService;

    @PostMapping("/api/series")
    public ResponseEntity<GenericResponse> crearSerie(@RequestBody Serie serieInfo){
        
        serieService.grabar(serieInfo);
        GenericResponse response = new GenericResponse();
        response.isOK = true;
        response.message =  "Serie creada con exito!";
        response.id= serieInfo.get_id().toHexString();

        return  ResponseEntity.ok(response);
    }
    
    @GetMapping("/api/series")
    public ResponseEntity<List<Serie>> listarSeries(){

        return ResponseEntity.ok(serieService.listarSeries());
    }
}