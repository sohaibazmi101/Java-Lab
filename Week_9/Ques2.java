package Week_9;

class University{
    private String name;
    private int ranking;
    public University(String name, int ranking){
        this.name = name;
        this.ranking = ranking;
    }
    public void details(){
        System.out.println("University Name : "+name);
        System.out.println("Ranking : "+ranking);
    }
}
class Faculty extends University{
    private String facultyName;
    public Faculty(String name, int ranking, String facultyName){
        super(name, ranking);
        this.facultyName = facultyName;
    }
    public void details(){
        super.details();
        System.out.println("Faculty Name : "+facultyName);
    }
}

class Department extends Faculty{
    private String departmentName;
    private String chairman;
    public Department(String name, int ranking, String facultyName, String departmentName, String chairman){
        super(name, ranking, facultyName);
        this.departmentName = departmentName;
        this.chairman = chairman;
    }
    public void details(){
        super.details();
        System.out.println("Department Name : "+departmentName);
        System.out.println("Chairman Name : "+chairman);
    }
    public void display(){
        details();
    }
}


public class Ques2 {
    public static void main(String[] args) {
        Department department = new Department("AMU", 100, "Science", "Computer Science", "Dr. Javed");
        department.display();
    }
}
