package proxyPattern.ex2;

import java.util.List;

public interface MemberRepository {
    public String findById(long id);

    public List<String> findAll();
}
