package PrototypePattern2;

import java.io.Serializable;

/**
 * Created by tianf on 2016/8/12.
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void download() {
        System.out.println("下载附件，文件名为"	+	name);
    }
}
