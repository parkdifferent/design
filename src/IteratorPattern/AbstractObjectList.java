package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianf on 2016/8/15.
 */
abstract class AbstractObjectList {

    protected List<Object> objects	=	new ArrayList<Object>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }


    public List getObjects() {
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public	abstract	AbstractIterator	createIterator();






}
