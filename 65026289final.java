import java.util.ArrayList;

class Employee implements Person, Job {
    private String name;
    private int age;
    private String position;
    private String empID;
    private ArrayList<Project> myProjects = new ArrayList<>();

    public Employee(String name, String position, String empID) {
        this.name = name;
        this.position = position;
        this.empID = empID;
    }

    public void addProject(Project project) {
        myProjects.add(project);
    }

    public void showDetails() {
        System.out.println("name: " + name);
        System.out.println("position: " + position);
        System.out.println("EmpId: " + empID);
        System.out.println("project");
        for (Project project : myProjects) {
            System.out.println(project.getProjectName() + ": " + project.getDescription());
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getEmpID() {
        return empID;
    }

    @Override
    public void setEmpID(String empID) {
        this.empID = empID;
    }
}


interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}


interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}


class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProjectName() {
        return projectName;
    }
}


public class fina; {
    public static void final(String[] args) {
        
        Employee employee1 = new Employee("Tom", "ux/ui", "0001");
        Project project1 = new Project("webA", "Web A Developing a web application Mobile app A");
        employee1.addProject(project1);

       
        System.out.println("name: " + employee1.getName());
        System.out.println("position: " + employee1.getPosition());
        System.out.println("EmpId: " + employee1.getEmpID());
        System.out.println("project");
        for (Project project : employee1.myProjects) {
            System.out.println(project.getProjectName() + ": " + project.getDescription());
        }
        System.out.println();

        
        Employee employee2 = new Employee("Tim", "font end", "0002");
        Project project2 = new Project ("webA", "Developing a web application");
        employee2.addProject(project2);

       
        System.out.println("name: " + employee2.getName());
        System.out.println("position: " + employee2.getPosition());
        System.out.println("EmpId: " + employee2.getEmpID());
        System.out.println("project");
        for (Project project : employee2.myProjects) {
            System.out.println(project.getProjectName() + ": " + project.getDescription());
        }
        System.out.println();
    }
}    
