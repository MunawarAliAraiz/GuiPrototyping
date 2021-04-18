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
public class Advisor {
    private String name;
    private String ID;
    private String type;
    private String DOB;
    private String experience;
    private String qualification;
    private String Department;
    private String email;
    private String password;
    private List<Project> projectList = new ArrayList<Project>();
    private List<Group> groupList = new ArrayList<Group>();

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(Group g) {
        this.groupList.add(g);
    }

    public List<Project> getprojectList() {
        return projectList;
    }

    public void setprojectList(Project project) {
        this.projectList.add(project);
    }
    
    public void setprojectListDel(String ID) {
        int index = searchProject(ID);
       if(index != -1)
       {
           this.projectList.remove(index);
       }
    }
    
    public void setProjectList(String ID ,Project p){
       int index = searchProject(ID);
       if(index != -1)
       {
           this.projectList.set(index, p);
       }  
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
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
    
    private int searchProject(String number)
    {
        int index = -1;
         for(int i = 0 ; i  < projectList.size(); i++)
         {
             if(projectList.get(i).getProjectID().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
}
