package com.umg.diseno.sistemas.bs.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/generic-controller", produces = MediaType.APPLICATION_JSON_VALUE)
public class GenericController extends AbstractController{
    
 
}
