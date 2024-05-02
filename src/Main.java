public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ebru Hoca", "MZK", "555");
        Teacher t2 = new Teacher("Yaser Hoca", "FZK", "444");
        Teacher t3 = new Teacher("Şevval Hoca", "MAT", "333");

        Course müzik = new Course("Müzik", "101", "MZK");
        müzik.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik", "103", "MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Ayşe Yılmaz", "638", "4", müzik, fizik, matematik);
        s1.addBulkExamGrade(100, 55, 68, 80, 90, 40);
        s1.isPass();

        Student s2 = new Student("Erdem Güner", "345", "8", müzik, fizik, matematik);
        s2.addBulkExamGrade(35, 62, 15, 40, 50, 60);
        s2.isPass();

    }
}