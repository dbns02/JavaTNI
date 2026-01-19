public class Student {
    private String name;
    private int study_year;
    private int score = 0;

    void setName(String name) {
        this.name /*global*/ = name /*local*/;
    }
    String getName() {
        return this.name; //return this.name
    }
    void setStudyYear(int study_year) {
        this.study_year = study_year;
    }
    int getStudyYear() {
        return this.study_year;
    }
    int getScore() {
        return this.score;
    }
    void addPoint(int point) {
        this.score += point;
        System.out.println(this.name + " got " + point + " points");
    }
    String getGrade() {
        if (this.score >= 80) {
            return "A";
        } else if (this.score >= 70) {
            return "B";
        } else if (this.score >= 60) {
            return "C";
        } else {
            return "F";
        }
        /*if (score >= 80) return "A";
        * if (score >= 70) return "B";
        * if (score >= 60) return "C";
        * return "F";*/
    }
}
