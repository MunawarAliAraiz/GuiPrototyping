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
    private List<Student> studentList = new ArrayList<Student>();
    private List<Assignment> assignmentList = new ArrayList<Assignment>();
    private Project project = new Project();
    private String groupID;

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
   
    private String session;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(Assignment assignment) {
        this.assignmentList.add(assignment);
    }
}
