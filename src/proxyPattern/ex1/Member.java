package proxyPattern.ex1;

public class Member implements IMember{
    String name;
    int age;

    public Member() {
        System.out.println("Real 객체 생성");
    }

    @Override
    public void setAge(int age) {
        System.out.println("real::setAge");
        this.age = age;
    }

    @Override
    public void setName(String name) {
        System.out.println("real::setName");
        this.name = name;
    }

    @Override
    public int getAge() {
        System.out.println("real::getAge");
        return age;
    }

    @Override
    public String getName() {
        System.out.println("real::getName");
        return name;
    }
}
