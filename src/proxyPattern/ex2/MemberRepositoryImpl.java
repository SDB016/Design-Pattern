package proxyPattern.ex2;

import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryImpl implements MemberRepository{

    @Override
    public String findById(long id) {
        System.out.println("Real::findById 실행 중");
        return "Man" + id;
    }

    @Override
    public List<String> findAll() {
        System.out.println("Real::findAll 실행중");
        return new ArrayList<>(List.of("OneMan", "TwoMan"));
    }
}
