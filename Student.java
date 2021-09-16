/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class Student {
    
    static java.util.ArrayList<Student> Students = new java.util.ArrayList<Student>();
    private String id;
    private String name;
    
    
    
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        Students.add(this);        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public void deleteStudent(String id, String name) {
        for (int i=0; i < Students.size(); i++) {
            if ((Students.get(i).id == id) && (Students.get(i).name == name)) {                
                Students.remove(i);
            }
        }
    }
    
    
    
    public static int getClasses(String id, String name) {
        int classes = 0;
        for (int i = 0; i < Registration.Registrations.size(); i++) {
            if ((Registration.Registrations.get(i).student.id == id) && (Registration.Registrations.get(i).student.id == id)) {
                classes = classes + 1;
            }
            
        }
        
        
        return(classes);
    }
    
    
    
    
    
}
