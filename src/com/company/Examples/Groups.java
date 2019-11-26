package com.company.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Groups {

    public static void main(String[] args){

//        //сгруппировать всех студентов по курсу.

//        students.stream()
//                .collect(Collectors.groupingBy(Student::getYear))
//                .entrySet().forEach(System.out::println);

        //в алфавитном порядке список специальностей, на которых учатся перечисленные в списке студенты.

        IntFunction<IntFunction<String>> function = i -> j -> String.format("%d x %2d = %2d", i, j, i * j);
        IntFunction<IntFunction<IntFunction<String>>> repeaterX = count -> i -> j ->
                IntStream.range(0, count)
                        .mapToObj(delta -> function.apply(i + delta).apply(j))
                        .collect(Collectors.joining("\t"));
        IntFunction<IntFunction<IntFunction<IntFunction<String>>>> repeaterY = countY -> countX -> i -> j ->
                IntStream.range(0, countY)
                        .mapToObj(deltaY -> repeaterX.apply(countX).apply(i).apply(j + deltaY))
                        .collect(Collectors.joining("\n"));
        IntFunction<String> row = i -> repeaterY.apply(10).apply(4).apply(i).apply(1) + "\n";
        IntStream.of(2, 6).mapToObj(row).forEach(System.out::println);

    }

    static List<Student> students = Arrays.asList(
            new Student("Alex", Speciality.Physics, 1),
            new Student("Rika", Speciality.Biology, 4),
            new Student("Julia", Speciality.Biology, 2),
            new Student("Steve", Speciality.History, 4),
            new Student("Mike", Speciality.Finance, 1),
            new Student("Hinata", Speciality.Biology, 2),
            new Student("Richard", Speciality.History, 1),
            new Student("Kate", Speciality.Psychology, 2),
            new Student("Sergey", Speciality.ComputerScience, 4),
            new Student("Maximilian", Speciality.ComputerScience, 3),
            new Student("Tim", Speciality.ComputerScience, 5),
            new Student("Ann", Speciality.Psychology, 1)
    );

    static class Student{
        String Name;
        Speciality Speciality;
        int Year;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public Speciality getSpeciality() {
            return Speciality;
        }

        public void setSpeciality(Speciality speciality) {
            this.Speciality = speciality;
        }

        public int getYear() {
            return Year;
        }

        public void setYear(int year) {
            this.Year = year;
        }

        public Student(String name, Speciality speciality, int Year) {
            this.Name = name;
            this.Speciality = speciality;
            this.Year = Year;
        }

        @Override
        public String toString() {
            return Name+":"+Speciality+"-"+Year;
        }
    }

    enum Speciality {
        Biology, ComputerScience, Economics, Finance,
        History, Philosophy, Physics, Psychology
    }
}
