import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanStreak =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());
        Cat catBeanStreak =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanStreak.getName());

        System.out.println(bean == beanStreak);
        System.out.println(catBean == catBeanStreak);
    }
}