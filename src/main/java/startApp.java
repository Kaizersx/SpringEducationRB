import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robotT1000.T1000;

public class startApp {

    public static void main(String[] args) {


        ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");

        T1000 t1000=(T1000)context.getBean("t1000");




    }




}
