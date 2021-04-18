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
public class Admin {
    
    private Admin(){
    };
    private static Admin object = null;
    
    public static Admin getInstance()
    {
        if(object == null)
        {
            object = new Admin();
        }
        return object;
    }
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Advisor> advisorList = new ArrayList<>();
    ArrayList<Project> projectList = new ArrayList<>();
    ArrayList<Group> groupList = new ArrayList<>();
    ArrayList<Assignment> assignmentList = new ArrayList<>();
    
    public static boolean addStudent(Student s)
    {
        boolean flag = false;
        Admin obj = Admin.getInstance();
        if(obj.studentList.add(s))
        {
            flag = true;
        }
        return flag;
    }
    
    public static boolean addAdvisor(Advisor a)
    {
        boolean flag = false;
        Admin obj = Admin.getInstance();
        if(obj.advisorList.add(a))
        {
            flag = true;
        }
        return flag;
    }
    
    public static boolean addProject(Project p)
    {
        boolean flag = false;
        Admin obj = Admin.getInstance();
        if(obj.projectList.add(p))
        {
            flag = true;
        }
        return flag;
    }
    
    public static boolean addAssignment(Assignment as)
    {
        boolean flag = false;
        Admin obj = Admin.getInstance();
        if(obj.assignmentList.add(as))
        {
            flag = true;
        }
        return flag;
    }
    
    public static boolean addGroup(Group g)
    {
        boolean flag = false;
        Admin obj = Admin.getInstance();
        if(obj.groupList.add(g))
        {
            flag = true;
        }
        return flag;
    }
    
    public static ArrayList<Project> getAllProjects(){
        Admin obj = Admin.getInstance();
        return obj.projectList;
    }
    
    public static ArrayList<Student> getAllStudents(){
        Admin obj = Admin.getInstance();
        return obj.studentList;
    }
    
    public static ArrayList<Assignment> getAllAssignmnets(){
        Admin obj = Admin.getInstance();
        return obj.assignmentList;
    }
    
    public static ArrayList<Advisor> getAllAdvisors(){
        Admin obj = Admin.getInstance();
        return obj.advisorList;
    }
    
    public static ArrayList<Group> getAllGroups(){
        Admin obj = Admin.getInstance();
        return obj.groupList;
    }
    
    public static int searchAdvisor(String number)
    {
        Admin obj = Admin.getInstance();
        int index = -1;
         for(int i = 0 ; i  < obj.advisorList.size(); i++)
         {
             if(obj.advisorList.get(i).getID().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    public static int searchGroup(String number)
    {
        Admin obj = Admin.getInstance();
        int index = -1;
         for(int i = 0 ; i  < obj.groupList.size(); i++)
         {
             if(obj.groupList.get(i).getGroupID().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    private static int searchAdvisorByPID(String number)
    {
        Admin obj = Admin.getInstance();
        int index = -1;
         for(int i = 0 ; i  < obj.advisorList.size(); i++)
         {
             for(int j = 0; j < obj.advisorList.get(i).getprojectList().size(); j++)
             {
                if(obj.advisorList.get(i).getprojectList().get(j).getProjectID().equals(number))
                {
                    index = i;
                    break;
                }
             }
         }
         
        return index;
    }
    
    public static Advisor getAdvisor(String number)
    {
        Admin obj = Admin.getInstance();
        int index = searchAdvisor(number);
        return obj.advisorList.get(index);
    }
    
    public static Group getGroup(String number)
    {
        Admin obj = Admin.getInstance();
        int index = searchGroup(number);
        return obj.groupList.get(index);
    }
    
    public static Advisor getAdvisorByPID(String number)
    {
        Admin obj = Admin.getInstance();
        int index = searchAdvisorByPID(number);
        return obj.advisorList.get(index);
    }
    
    public static boolean updateAdvisor(String ID ,Advisor a){
       int index = searchAdvisor(ID);
        Admin obj = Admin.getInstance();
       if(index == -1)
           return false;
       else {
           obj.advisorList.set(index, a);
           return true;
       }
    }
    
    public static boolean DeleteAdvisor(String ID){
       int index = searchAdvisor(ID);
        Admin obj = Admin.getInstance();
       if(index == -1)
           return false;
       else {
           obj.advisorList.remove(index);
           return true;
       }
    }
    
    private static int searchProject(String number)
    {
        Admin obj = Admin.getInstance();
        int index = -1;
         for(int i = 0 ; i  < obj.projectList.size(); i++)
         {
             if(obj.projectList.get(i).getProjectID().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    private static int searchAssignment(String number)
    {
        Admin obj = Admin.getInstance();
        int index = -1;
         for(int i = 0 ; i  < obj.assignmentList.size(); i++)
         {
             if(obj.assignmentList.get(i).getAssignNo().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    public static int searchGroupAssignment(String number)
    {
        Group obj = new Group();
        int index = -1;
         for(int i = 0 ; i  < obj.getAssignmentList().size(); i++)
         {
             if(obj.getAssignmentList().get(i).getAssignNo().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    public static Assignment getAssignment(String number)
    {
        Admin obj = Admin.getInstance();
        int index = searchProject(number);
        return obj.assignmentList.get(index);
    }
    
    public static Project getProject(String number)
    {
        Admin obj = Admin.getInstance();
        int index = searchProject(number);
        return obj.projectList.get(index);
    }
    
    public static boolean updateProject(String ID ,Project p){
       int index = searchProject(ID);
        Admin obj = Admin.getInstance();
       if(index == -1)
           return false;
       else {
           obj.projectList.set(index, p);
           return true;
       }
    }
    
    public static boolean updateAssignment(String ID ,Assignment a){
       int index = searchAssignment(ID);
        Admin obj = Admin.getInstance();
       if(index == -1)
           return false;
       else {
           obj.assignmentList.set(index, a);
           return true;
       }
    }
    
    public static boolean DeleteProject(String ID){
       int index = searchProject(ID);
        Admin obj = Admin.getInstance();
       if(index == -1)
           return false;
       else {
           obj.projectList.remove(index);
           return true;
       }
    }
    
    public static boolean DeleteAssignment(String ID){
       int index = searchAssignment(ID);
        Admin obj = Admin.getInstance();
       if(index == -1)
           return false;
       else {
           obj.assignmentList.remove(index);
           return true;
       }
    }
    
    public static int searchStudent(String number)
    {
        Admin obj = Admin.getInstance();
        int index = -1;
         for(int i = 0 ; i  < obj.studentList.size(); i++)
         {
             if(obj.studentList.get(i).getID().equals(number))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    
    public static Student getStudent(String number)
    {
        Admin obj = Admin.getInstance();
        int index = searchStudent(number);
        return obj.studentList.get(index);
    }
    
    
    public static boolean DeleteStudent(String ID){
       int index = searchStudent(ID);
        Admin obj = Admin.getInstance();
       if(index == -1)
           return false;
       else {
           obj.studentList.remove(index);
           return true;
       }
    }
}
