package ecourse.base.courseManagement.Controllers;

import ecourse.base.courseManagement.repositories.CourseRepository;
import ecourse.base.infrastructure.persistence.PersistenceContext;
import ecourse.base.usermanagement.domain.Course.Course;
import ecourse.base.usermanagement.domain.Course.CourseCode;
import ecourse.base.usermanagement.domain.Course.CourseDto;
import ecourse.base.usermanagement.domain.Course.courseMapper;

import java.util.ArrayList;
import java.util.List;

public class OpenCourseController {

    private final CourseRepository repo = PersistenceContext.repositories().courses();
    public void OpeningCourses(List<String> selectedCourses) {
        for (String  selectedCourse : selectedCourses) {
            Course course = findbyCode(selectedCourse);
            OpenCourse(course);
            add(course);
        }

    }

    public List<CourseDto>getClosedCourses() {
        List<Course> courses = repo.findAllClosed();
        List<CourseDto> coursesDto = new ArrayList<>();

        for (Course course : courses) {
            coursesDto.add(courseMapper.CoursetoDto(course));
        }

        return coursesDto;

    }

    public Course findbyCode(String code) {
        CourseCode courseCode = CourseCode.valueOf(code);
        if (repo.findByCode(courseCode).isEmpty()) {
            System.out.println("Course not found");
            return null;
        }
        return repo.findByCode(courseCode).get();

    }
    private void OpenCourse(Course course){
        course.OpenCourse();
    }

    public void add(Course course){
         repo.save(course);

    }

}
