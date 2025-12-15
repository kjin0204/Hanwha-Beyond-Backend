package ohgiraffers.section03.overriding;

public class SuperClass {

    /* 수업목표. 오버리이딩에 대해 이해할 수 있다. */
    public void method(int num){}
    public Object method2(int num){
        return null;
    }
    private void privateMethod(){}
    public final void finalMethod(){}
    
    /* 설명. protected 상속받은 클랙스와 같은 패키지에 있을때만 접근 가능. */
    protected void protectedMethod(){}
    
    /* 설명. 같은 패키지안에 있을때는 접근 가능. */
    void defaultMethod(){}

}
