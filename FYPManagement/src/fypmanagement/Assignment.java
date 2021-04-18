/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fypmanagement;

/**
 *
 * @author Munawar Ali
 */
public class Assignment {
    private String title;
    private String marks;
    private String rubrics;
    private String deadline;
    private String groupID;
    private String assignNo;
    private String obtainedMarks = "Not Marked";
    private String grade = "Not Given";

    public String getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(String obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAssignNo() {
        return assignNo;
    }

    public void setAssignNo(String assignNo) {
        this.assignNo = assignNo;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getRubrics() {
        return rubrics;
    }

    public void setRubrics(String rubrics) {
        this.rubrics = rubrics;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
