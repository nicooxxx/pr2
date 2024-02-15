package de.bht.pr2.lab02.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import de.bht.pr2.lab02.part1.Student;
class MyTest {

  @Test
  void testStudentKonstruktor() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {
    Student student = new Student("Anna Alt,70001,Medieninformatik,312");
    assertEquals("Student [name='Anna Alt, registrationNumber=70001, courseOfStudies='Medieninformatik]", student.toString());
  }
  @Test
  void testStudentParseException() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {

    assertThrows(StudentParseException.class, ()-> new Student("Anna Alt,70001,Medieninformatik"));
  }

  @Test
  void testStudentLänge() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {
    Student student = new Student("Anna Alt,70001,Medieninformatik");
    assertEquals("Not enough parts in data: 'Anna Alt,70001,Medieninformatik'", student.toString());

  }
  /*@Test
  void testStandortKmStand() {
    Car car = new Car("Audi", "gelb", "Berlin", 10000); // Arrange

    car.drive("Hamburg", 300);                           // Act

    assertEquals("Hamburg", car.getPosition());           // Assert
    assertEquals(10300, car.getKmStatus());                // Assert
  }*/
}
