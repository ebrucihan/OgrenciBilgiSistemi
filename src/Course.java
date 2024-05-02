public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralgrade;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        //Varsayılan olarak ders notu sıfır giriliyor.
        int note = 0;
        this.oralgrade =0;



    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }

    void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " Dersinin Akademisyeni: " +teacher.name);
        } else {
            System.out.println(this.name + " Dersine Akademisyen Atanmamıştır!");
        }
    }
}
