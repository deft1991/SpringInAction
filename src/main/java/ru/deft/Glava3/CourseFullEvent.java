package ru.deft.Glava3;

import org.springframework.context.ApplicationEvent;

/**
 * Created by s.golitsyn
 */

public class CourseFullEvent extends ApplicationEvent {
    private Course course;
    public CourseFullEvent(Object source, Course course) {
        super(source);
        this.course = course;
    }
    public Course getCourse() {
        return course;
    }
}
