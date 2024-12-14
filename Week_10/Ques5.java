package Week_10;

class University {
    String name;
    int ranking;
    public University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }
}

class Faculty extends University {
    String name;

    public Faculty(String universityName, int universityRanking, String name) {
        super(universityName, universityRanking);
        this.name = name;
    }

    public void Details() {
        System.out.println("Faculty Name: " + name);
    }
}

class Department extends Faculty {
    String name;
    String chairman;

    public Department(String universityName, int universityRanking, String facultyName, String departmentName, String chairman) {
        super(universityName, universityRanking, facultyName);
        this.name = departmentName;
        this.chairman = chairman;
    }

    public void Details() {
        System.out.println("Department Name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    public void Display() {
        super.Details();
        Details();
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Department department = new Department("Aligarh Muslim University", 100, "Science Faculty", "Computer Science", "Dr. Faisal");
        department.Display();
        System.out.println("University Ranking: " + department.ranking);
    }
}
