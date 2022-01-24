package templateMethodPattern;

public class ConcreteClass extends AbstractClass{
    @Override
    protected void hook1() {
        System.out.println("ABSTRACT hook1 impl");
    }

    @Override
    protected void hook2() {
        System.out.println("ABSTRACT hook2 impl");
    }
}
