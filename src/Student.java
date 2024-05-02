public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarageGrade;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAvarege();
        this.isPass = false;


    }

    void addBulkExamGrade(int mzknote, int mzkOralGrade, int fzknote, int fzkOralGrade, int matnote, int matOralGrade) {
        if (mzknote >= 0 && mzknote <= 100) {
            this.c1.note = mzknote;
        }
        if (mzkOralGrade >= 0 && mzkOralGrade <= 100) {
            this.c1.oralgrade = mzkOralGrade;
        }
        if (fzknote >= 0 && fzknote <= 100) {
            this.c2.note = fzknote;
        }
        if (fzkOralGrade >= 0 && fzkOralGrade <= 100) {
            this.c2.oralgrade = fzkOralGrade;
        }
        if (matnote >= 0 && matnote <= 100) {
            this.c3.note = matnote;
        }
        if (matOralGrade >= 0 && matOralGrade <= 100) {
            this.c3.oralgrade = matOralGrade;
        }
    }

    void isPass() {
        if (this.c1.note == 0 || this.c1.oralgrade == 0 || this.c2.note == 0 || this.c2.oralgrade == 0 || this.c3.note == 0 || this.c3.oralgrade == 0) {
            System.out.println("Notların Tamamı Girilmemiştir!");
        } else {
            this.isPass = isPass;
            printNote();
            System.out.println("Ortalama: " + this.avarageGrade);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti!");
            } else {
                System.out.println("Sınıfta Kaldı!");
            }
        }
    }


    void calcAvarege() {

        this.avarageGrade = ((c1.note * 0.8 + c1.oralgrade * 0.2) + (c2.note * 0.8 + c2.oralgrade * 0.2) + (c3.note * 0.8 + c3.oralgrade * 0.2)) / 3;
    }

    boolean isCheckPass() {
        calcAvarege();
        return this.avarageGrade > 55;
    }


    void printNote() {
        System.out.println("=====================");
        System.out.println("Öğrenci: " + this.stuNo);
        System.out.println("Matematik Notu: " + (c1.note * 0.8 + c1.oralgrade * 0.2));
        System.out.println("Fizik Notu: " + (c2.note * 0.8 + c2.oralgrade * 0.2));
        System.out.println("Kimya Notu: " + (c3.note * 0.8 + c3.oralgrade * 0.2));
    }
}
