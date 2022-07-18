package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController2 {

    private StudentService studentService;

    /*@Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @PostMapping("/students")
    public String insert(@RequestBody Student student){
        String sql="INSERT INTO student(name) VALUE(:studentName)";

        Map<String,Object> map =new HashMap<>();
        map.put("studentName",student.getName());

        KeyHolder keyHolder=new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql,new MapSqlParameterSource(map),keyHolder);

        int id=keyHolder.getKey().intValue();

        System.out.println("mysql自動生成的id:"+id);

        return "執行INSERT sql";
    }

    @PostMapping("/students/batch")
    public String insert(@RequestBody List<Student> studentList){

        String sql="INSERT INTO student(name) VALUE(:studentName)";

        MapSqlParameterSource[] parameterSources=new MapSqlParameterSource[studentList.size()];

        for (int i=0 ; i<studentList.size();i++){
            Student student=studentList.get(i);

            parameterSources[i]=new MapSqlParameterSource();
            parameterSources[i].addValue("studentName",student.getName());
        }

        namedParameterJdbcTemplate.batchUpdate(sql,parameterSources);

        return "執行一批INSERT sql";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){
        String sql="DELETE FROM student WHERE id=:studentId";

        Map<String,Object> map=new HashMap<>();
        map.put("studentId",studentId);

        namedParameterJdbcTemplate.update(sql,map);

        return "執行DELETE sql";
    }


    @GetMapping("/students/{studentId}")
    public Student select(@PathVariable Integer studentId){
        return studentService.getById(studentId);
    }*/
}
