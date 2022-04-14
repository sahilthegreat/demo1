package com.example.demo1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("api")
public class FileController {

    @GetMapping("/fileDownload")
    public void fileDownload(HttpServletResponse response) {
        response.setContentType("application/csv");
        response.setHeader("Content-Disposition", "attachment;filename=" + "students.csv");
        try {
            ServletOutputStream outputStream = response.getOutputStream();
            outputStream.println("Name, RollNo, Course, Branch");
            outputStream.println("Rohit Sharma, 21, B.Tech, CSE");
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
