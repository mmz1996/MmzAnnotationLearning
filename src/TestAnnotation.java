/**
 * @Classname TestAnnotation1
 * @Description TODO
 * @Date 2020/12/9 9:41
 * @Created by mmz
 */
/*注解是什么*/
public class TestAnnotation extends Object{
    // 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }
    // 不推荐使用
    @Deprecated
    public static void test(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        test();
    }
}
