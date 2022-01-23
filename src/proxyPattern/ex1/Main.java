package proxyPattern.ex1;

public class Main {
    public static void main(String[] args) {
        IMember member = new ProxyMember();
        member.setAge(20);
        member.setName("홍길동");

        System.out.println(member.getAge());
        System.out.println(member.getName());
    }
}
