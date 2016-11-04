package PrototypePattern1;

/**
 * Created by tianf on 2016/8/12.
 */
public class Client {


    //由于使用的是浅克隆技术，因此工作周报对象复制成功，通过“==”比较原型对象和克隆对象 的内存地址时输出false；
    // 但是比较附件对象的内存地址时输出true，说明它们在内存中是同一 个对象。


    public static void main(String args[]) {

        try {
            WeeklyLog log_previous,	log_new;
            log_previous =	new	WeeklyLog();	//创建原型对象


            Attachment attachment = new Attachment();  //创建附件对象

            log_previous.setAttachment(attachment);  //周报添加附件对象
            log_new		=	log_previous.clone1();	//调用克隆方法创建克隆对象

            //周报比较
            System.out.println(log_previous == log_new);

            //附件比较
            System.out.println(log_previous.getAttachment() == log_new.getAttachment());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }





    }
}
