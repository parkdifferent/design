package PrototypePattern2;

import java.io.IOException;

/**
 * Created by tianf on 2016/8/12.
 */
public class Client {




    public static void main(String args[]) {

        try {
            WeeklyLog log_previous,	log_new;
            log_previous =	new WeeklyLog();	//创建原型对象


            Attachment attachment = new Attachment();  //创建附件对象

            log_previous.setAttachment(attachment);  //周报添加附件对象
            log_new		=	log_previous.deepClone();	//调用克隆方法创建克隆对象

            //周报比较
            System.out.println(log_previous == log_new);

            //附件比较
            System.out.println(log_previous.getAttachment() == log_new.getAttachment());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }





    }
}
