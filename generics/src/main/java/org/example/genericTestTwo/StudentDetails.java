package org.example.genericTestTwo;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentDetails {

    private String name;

    private String id;
    private String studentMajor;
    private String studentYear;

    private String semeter;
    private int noOfCourses;

    private JSONObject highestScore;

    private String studentPos;

    // private JSONObject studenObj;

    private String highScoreSubjectname;

    private int highScoreSubjectMark;
    private Map<String, LinkedHashMap> details = new HashMap<>();


    //First try it out with json

    //Second try it out with hashmap


    public StudentDetails(String name, String id, String studentPos, String studentMajor, String studentYear, String semester, int noOfCourses, String highScoreSubjectname, int highScoreSubjectMark) {
        this.name = name;
        this.id = id;
        this.studentPos = studentPos;
        this.studentMajor = studentMajor;
        this.studentYear = studentYear;
        this.semeter = semester;
        this.noOfCourses = noOfCourses;
        this.highScoreSubjectname = highScoreSubjectname;
        this.highScoreSubjectMark = highScoreSubjectMark;

    }

    private JSONObject highScore() {
        JSONObject highScore = new JSONObject();
        highScore.put(this.highScoreSubjectname, highScoreSubjectMark);
        return this.highestScore = highScore;
    }



       /*private  JSONObject gatherDetails(){
           LinkedHashMap<String, Object> studenObj = new LinkedHashMap<>();

            studenObj.put("name",this.name);
            studenObj.put("id",this.id);
            studenObj.put("major",this.studentMajor);
            studenObj.put("level",this.studentYear);
            studenObj.put("Current Semester",this.semeter);
            studenObj.put("Number of Courses",this.noOfCourses);
            studenObj.put("highestScore", highScore());

            return new JSONObject(studenObj);
       }*/

    private LinkedHashMap gatherDetails() {
        LinkedHashMap<String, Object> studenObj = new LinkedHashMap<>();

        studenObj.put("name", this.name);
        studenObj.put("id", this.id);
        studenObj.put("major", this.studentMajor);
        studenObj.put("level", this.studentYear);
        studenObj.put("Current Semester", this.semeter);
        studenObj.put("Number of Courses", this.noOfCourses);
        studenObj.put("highestScore", highScore());

        return studenObj;
    }

    public void viewDetails() {
        details.put(this.studentPos, gatherDetails());
        System.out.println(details);


    }


}




