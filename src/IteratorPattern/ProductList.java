package IteratorPattern;

import java.util.List;

/**
 * Created by tianf on 2016/8/15.
 */

//商品数据类：具体聚合类
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> products) {
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return	new	ProductIterator(this);
    }
}
