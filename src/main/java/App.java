import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catOne =
                (Cat) applicationContext.getBean("cat");
        Cat catTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(helloOne.equals(helloTwo) + ", " + catOne.equals(catTwo));
    }
}