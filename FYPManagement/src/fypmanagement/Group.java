/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fypmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Munawar Ali
 */
public class Group {
    private List<String> studentList = new ArrayList<String>();
    private List<String> assignmentList = new ArrayList<String>();
    private String project;
    private String groupID;

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }
   
    private String session;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public List<String> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(String assignment) {
        this.assignmentList.add(assignment);
    }
}
