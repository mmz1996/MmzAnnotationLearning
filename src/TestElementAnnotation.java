import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname TestElementAnnotation
 * @Description TODO
 * @Date 2020/12/9 10:03
 * @Created by mmz
 */
/*元注解的学习*/

public class TestElementAnnotation {
    @MyAnnotation
    public void test(){

    }
}

// 定义一个注解
@Target(value = {ElementType.METHOD,ElementType.TYPE})  // 表示这个注解可以在哪个目标位置使用
@Retention(value = RetentionPolicy.RUNTIME) // 表示我们的注解在哪里有效
@interface MyAnnotation{

}
