package Lesson_5_Class;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public void getdisplayInfo(){
        System.out.println("Name: " + name + " / " + "Position: " + position + " / " + "Email: "
                + email + " / " + "Phone: " + phone_number + " / " + "Salary: " + salary + " / " + "Age: " + age);
    }


    public Worker(String _name,String _position, String _email, String _phone_number, int _salary, int _age){
        name = _name;
        position = _position;
        email = _email;
        phone_number = _phone_number;
        salary = _salary;
        age = _age;
    }

    public int getAge() {
        return age;
    }

}
