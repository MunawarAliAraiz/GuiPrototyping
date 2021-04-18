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
public class Student {
    private String name;
    private String ID;
    private String session;
    private String Department;
    private String Project;
    private String Advisor;
    private String GroupID;
    private String email;
    private String password;

    public String getProject() {
        return Project;
    }

    public boolean setProject(String Project) {
        this.Project = Project;
        return true;
    }

    public String getAdvisor() {
        return Advisor;
    }

    public void setAdvisor(String Advisor) {
        this.Advisor = Advisor;
    }

    public String getGroupID() {
        return GroupID;
    }

    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
