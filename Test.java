import java.util.ArrayList;

class StudentManager {
    private ArrayList<Student> students;
    
    public StudentManager() {
        students = new ArrayList<Student>();
    }
    
    public boolean addStudent(String name, int score) {
        // 先验证成绩
        if (score < 0 || score > 100) {
            System.out.println("添加失败: 成绩 " + score + " 必须在0-100之间");
            return false;  // 返回false表示添加失败
        }
        
        Student s = new Student(name, score);
        students.add(s);
        return true;  // 返回true表示添加成功
    }
    
    public void printAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名: " + s.name + ", 成绩: " + s.score);
        }
    }
    
    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (Student s : students) {
            total += s.score;
        }
        return (double) total / students.size();
    }
    
    public Student findStudent(String name) {
        for (Student s : students) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }
}

class Student {
    public String name;
    public int score;
    
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Test {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        
        manager.addStudent("张三", 85);
        manager.addStudent("李四", 92);
        
        // 尝试添加无效成绩
        boolean success = manager.addStudent("王五", -5);
        if (!success) {
            System.out.println("王五的成绩无效，未添加到系统中");
        }
        
        System.out.println("所有学生:");
        manager.printAllStudents();
        
        System.out.println("平均分: " + manager.calculateAverage());
        
        Student found = manager.findStudent("张三");
        if (found != null) {
            System.out.println("找到学生: " + found.name);
        }
    }
}