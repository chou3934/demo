package com.example.demo;

import com.example.demo.tester.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/students")
    public String create(@RequestBody Student student){

        studentRepository.save(student);

        return "執行資料的create操作";
    }


    @GetMapping("/students/{studentId}")
    public Student read(@PathVariable Integer studentId){

        Student student =studentRepository.findById(studentId).orElse(null);

        return student;
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student){
        Student s =studentRepository.findById(studentId).orElse(null);

        if(s!=null){
            s.setName(student.getName());
            studentRepository.save(s);
            return "執行資料庫的update操作";
        }else{
            return "update失敗,資料不存在";
        }


    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){

        studentRepository.deleteById(studentId);

        return "執行資料庫的delete操作";
    }
}
