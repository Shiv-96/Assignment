package com.csvCalculator.Service;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import org.springframework.stereotype.Service;

import javax.script.ScriptException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


@Service
public class CSVService {

    public final String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void processCSV(String inputPath, String outputPath) throws IOException, ScriptException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(inputPath));
        CSVWriter writer = new CSVWriter(new FileWriter(outputPath));

        String[] nextLine;
        String[][] mat = new String[4][3];
        int row = 0;
        while ((nextLine = reader.readNext()) != null) {
            for (int col = 1; col <= nextLine.length; col++) {
                String value = nextLine[col - 1];
                mat[row][col-1] = value;
                if (value.contains("=")) {
                    int end = value.length()-1;
                    String y = value.substring(2, end);
                    int sum = 0;
                    
                    String[] charArray = y.split("\\+");
                    for(int k=0; k < 2; k++){
                        String check = charArray[k];
                        if (str.contains(check.charAt(0)+"")) {
                            int row1 = str.indexOf(check.charAt(0)+"");
                            int col1 = check.charAt(1)-49;
                            sum+=Integer.parseInt(mat[col1][row1]);
                        }
                        else{
                            int number = Integer.parseInt(check);
                            sum+=number;
                        }
                        mat[row][col-1] = sum+"";
                    }
                } else {
                    mat[row][col-1] = value;
                }

            }
            row++;
        }

        for(String[] x: mat){
            for(String y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        try (FileWriter writer2 = new FileWriter(outputPath)){
            for(String[] row2: mat) {
                for(int i = 0; i < row2.length; i++){
                    writer2.append(String.valueOf(row2[i]));
                    if(i < row2.length-1){
                        writer2.append(',');
                    }
                }
                writer2.append('\n');
            }
            
        } catch (IOException e) {
            e.getMessage();
        }

        reader.close();
        writer.close();
    }

    
}
