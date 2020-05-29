package JDBC;

public class Person {
    String Full_name;
    int age;
    String password;

    public String getFull_name() {
        return Full_name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
    }

    public void setAge(int age) {

        if(age<0 ){
            System.out.println("вік не може бути від'ємним");
            this.age=0;
        }else {
            this.age = age;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String full_name, int age, String password) {
        Full_name = full_name;
        this.age = age;
        this.password = password;
    }

    Person(String password,String full_name){
        this.password = password;
        Full_name = full_name;
    }

}
