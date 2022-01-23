package proxyPattern.ex2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyMemberRepositoryImpl implements MemberRepository{
    private MemberRepository memberRepository;
    private Map<Long, String> cache;

    public ProxyMemberRepositoryImpl() {
        this.cache = new HashMap<>();
    }

    @Override
    public String findById(long id) {
        System.out.println("proxy::findById 실행");
        String ret;
        if (memberRepository == null) {
            memberRepository = new MemberRepositoryImpl();
        }
        if (cache.containsKey(id)) ret = cache.get(id);
        else {
            ret = memberRepository.findById(id);
            cache.put(id, ret);
        }
        return ret;
    }

    @Override
    public List<String> findAll() {
        System.out.println("proxy::findAll 실행 중");
        if (memberRepository == null) memberRepository = new MemberRepositoryImpl();
        return memberRepository.findAll();
    }
}
