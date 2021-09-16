/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class Course {
    
    static java.util.ArrayList<Course> Courses = new java.util.ArrayList<Course>();
    private String course_name;
    private String course_prefix;  
    private double course_number;
    private int max_enroll;
    private int total_enroll;
    
    public Course(String course_name, String course_prefix, double course_number, int max_enroll, int total_enroll) {
        this.course_name = course_name;
        this.course_prefix = course_prefix;
        this.course_number = course_number;
        this.max_enroll = max_enroll;
        this.total_enroll = total_enroll;
        Courses.add(this);        
    }

    /**
     * @return the course_name
     */
    public String getCourse_name() {
        return course_name;
    }

    /**
     * @param course_name the course_name to set
     */
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    /**
     * @return the course_prefix
     */
    public String getCourse_prefix() {
        return course_prefix;
    }

    /**
     * @param course_prefix the course_prefix to set
     */
    public void setCourse_prefix(String course_prefix) {
        this.course_prefix = course_prefix;
    }

    /**
     * @return the course_number
     */
    public double getCourse_number() {
        return course_number;
    }

    /**
     * @param course_number the course_number to set
     */
    public void setCourse_number(double course_number) {
        this.course_number = course_number;
    }

    /**
     * @return the max_enroll
     */
    public int getMax_enroll() {
        return max_enroll;
    }

    /**
     * @param max_enroll the max_enroll to set
     */
    public void setMax_enroll(int max_enroll) {
        this.max_enroll = max_enroll;
    }

    /**
     * @return the total_enroll
     */
    public int getTotal_enroll() {
        return total_enroll;
    }

    /**
     * @param total_enroll the total_enroll to set
     */
    public void setTotal_enroll(int total_enroll) {
        this.total_enroll = total_enroll;
    }
    
    public void deleteCourse(String course_name, String course_prefix, double course_number) {
        for (int i=0; i < Courses.size(); i++) {
            if ((Courses.get(i).course_name == course_name) && (Courses.get(i).course_prefix == course_prefix) && (Courses.get(i).course_number == course_number)) {
                Courses.remove(i);
            }
        }
    }
    
    
    
    
    
}
