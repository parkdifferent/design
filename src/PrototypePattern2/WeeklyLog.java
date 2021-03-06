package PrototypePattern2;

import java.io.*;

/**
 * Created by tianf on 2016/8/12.
 */

/*
在Java语言中，如果需要实现深克隆，可以通过序列化(Serialization)等方式来实现。
序列化就 是将对象写到流的过程，写到流中的对象是原有对象的一个拷贝，而原对象仍然存在于内存 中。
通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象，因此 通过序列化将对象写到一个流中，
再从流里将其读出来，可以实现深克隆。需要注意的是能 够实现序列化的对象其类必须实现Serializable接口，否则无法实现序列化操作。
下面我们使用 深克隆技术来实现工作周报和附件对象的复制，由于要将附件对象和工作周报对象都写入流 中，
因此两个类均需要实现Serializable接口
 */

public class WeeklyLog implements Serializable {

    private Attachment attachment;  //附件

    private String name;
    private String data;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/


   /* public WeeklyLog clone1() throws CloneNotSupportedException {
            Object obj = null;
            obj = super.clone();
            return (WeeklyLog)obj;
    }*/

    public WeeklyLog deepClone() throws IOException,ClassNotFoundException {

        	//将对象写入流中
        ByteArrayOutputStream bao=new	ByteArrayOutputStream();
        ObjectOutputStream	oos=new ObjectOutputStream(bao);
        oos.writeObject(this);

        ///将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream	ois=new		ObjectInputStream(bis);
        return		(WeeklyLog)ois.readObject();


    }










}
