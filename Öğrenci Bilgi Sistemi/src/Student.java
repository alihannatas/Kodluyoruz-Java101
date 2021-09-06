public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    public void addOpinionNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.opinionNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.opinionNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.opinionNote = kimya;
        }
    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage(double matNotePercent,double fizikNotePercent,double kimyaNotePercent) {

        double fizikAvg =   this.fizik.note * fizikNotePercent +   (1-fizikNotePercent) * fizik.opinionNote;
        double kimyaAvg =   this.kimya.note  * kimyaNotePercent +   (1-kimyaNotePercent) * kimya.opinionNote;
        double matAvg   =   this.mat.note  * kimyaNotePercent   +   (1-matNotePercent)   * mat.opinionNote;

        this.avarage =   (fizikAvg + kimyaAvg + matAvg )  / 3;


    }

    public boolean isCheckPass() {
        calcAvarage(0.8,0.8,0.8);
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}