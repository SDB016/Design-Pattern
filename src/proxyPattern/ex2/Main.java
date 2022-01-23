package proxyPattern.ex2;

public class Main {
    public static void main(String[] args) {
        MemberRepository repository = new ProxyMemberRepositoryImpl();

        System.out.println("첫 실행");
        System.out.println(repository.findById(2));
        System.out.println();
        System.out.println("두번째 실행");
        System.out.println(repository.findById(2));
        System.out.println();
        System.out.println("findAll");
        System.out.println(repository.findAll());
    }
}
