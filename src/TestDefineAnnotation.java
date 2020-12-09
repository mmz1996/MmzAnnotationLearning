import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname TestDefineAnnotation
 * @Description TODO
 * @Date 2020/12/9 9:56
 * @Created by mmz
 */
/*自定义注解*/
public class TestDefineAnnotation {

    // 注解可以显示赋值，如果没有默认值，我们就必须给注解进行赋值
    @MyAnnotation2(name = "mmz",schools = "JLU")
    public void test(){

    }

    @MyAnnotation3("xixi") // 如果注解只有一个值，那么可以省略value赋值，直接写上值就可以了。
    public void test2(){

    }

}
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    // 注解的参数:参数类型:参数名+()
    String name() default "";
    int age() default 0;
    int id() default -1; // 如果默认值为-1，代表不存在

    String[] schools();
}
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String[] value();

}