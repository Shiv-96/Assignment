package com.csvCalculator.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csvCalculator.Service.CSVService;
import com.opencsv.exceptions.CsvValidationException;

@RestController
public class CSVController {

    @Autowired
    private CSVService csvService;


    @GetMapping("/process")
    public String processCSV(@RequestParam String inputPath, @RequestParam String outputPath) throws CsvValidationException, NumberFormatException, IOException {

        csvService.processCSV(inputPath, outputPath);
        return "CSV processed successfully!";

    }
}
