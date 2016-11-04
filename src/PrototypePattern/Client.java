package PrototypePattern;

/**
 * Created by tianf on 2016/8/12.
 */
public class Client {

    public static void main(String args[]) {
        WeeklyLog log_previous	=	new	WeeklyLog();		//创建原型对象
        log_previous.setName("张无忌");
        log_previous.setData("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        System.out.println("****周报****");
        System.out.println("周次："	+		log_previous.getData());
        System.out.println("姓名："	+		log_previous.getName());
        System.out.println("内容："	+		log_previous.getContent());														System.out.println("--------------------------------");
        WeeklyLog		log_new;
        try {
            log_new		=	log_previous.clone1();	//调用克隆方法创建克隆对象
            log_new.setData("第13周");
            System.out.println("****周报****");
            System.out.println("周次："	+	log_new.getData());
            System.out.println("姓名："	+	log_new.getName());
            System.out.println("内容："	+	log_new.getContent());


            System.out.println(log_previous	==	log_new);
            System.out.println(log_previous.hashCode() +"   " +log_new.hashCode());
            System.out.println(log_previous.getData()	==	log_new.getData());
            System.out.println(log_previous.getName()	==	log_new.getName());
            System.out.println(log_previous.getContent()	==	log_new.getContent());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }





    }
}
