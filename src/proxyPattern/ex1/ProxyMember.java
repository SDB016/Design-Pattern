package proxyPattern.ex1;

public class ProxyMember implements IMember{

    private Member member;
    private int age;

    @Override
    public void setAge(int age) {
        System.out.println("proxy::setAge");
        if (member != null) member.setAge(age);
        this.age = age;
    }

    @Override
    public void setName(String name) {
        System.out.println("proxy::setName");
        if (member != null) member.setName(name);

    }

    @Override
    public int getAge() {
        System.out.println("proxy::getAge");
        return this.age;
    }

    @Override
    public String getName() {
        System.out.println("proxy::getName");
        if (member == null) member = new Member();
        return member.getName();
    }
}
