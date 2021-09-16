/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class Registration {
    
    static java.util.ArrayList<Registration> Registrations = new java.util.ArrayList<Registration>();
    Student student;
    Course course;
    
    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
        Registrations.add(this);        
    }
    
    public void addRegistration(Student student, Course course) {
        if (course.getMax_enroll() > course.getTotal_enroll()) {
            course.setTotal_enroll(course.getTotal_enroll() + 1);
            new Registration(student, course);
        }             
    }
    
    public void deleteRegistration(Student student, Course course) {
        for (int i=0; i < Registrations.size(); i++) {
            if ((Registrations.get(i).student == student) && (Registrations.get(i).course == course)) {
                Registrations.remove(i);
                course.setTotal_enroll(course.getTotal_enroll() - 1);
            }
        }
    }
    
    
    
    
    
    
    
    
}
