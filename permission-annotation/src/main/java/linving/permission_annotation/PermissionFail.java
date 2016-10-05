package linving.permission_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author linyong
 * @Date 2016/10/4
 * @Time 21:57
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PermissionFail {
    int requestCode();
}
