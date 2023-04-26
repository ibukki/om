package com.bubuwork.jf.om.controller;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RestController
@RequestMapping("stat/res/")
public class StaticResourceController {

    @GetMapping("/countries")
    public ResponseEntity<String> getCountries() throws IOException {
        ClassPathResource staticDataResource = new ClassPathResource("data/countries.json");
        String staticDataString = IOUtils.toString(staticDataResource.getInputStream(), StandardCharsets.UTF_8);
        return new ResponseEntity<>(
                new JSONArray(staticDataString).toString(),
                HttpStatus.OK
        );
    }
}
