package AdapterPattern;

/**
 * Created by tianf on 2016/8/15.
 */

//操作适配器：适配器
public class OperationAdapter implements ScoreOperation {

    private	QuickSort	sortObj;	//定义适配者QuickSort对象
    private	BinarySearch	searchObj;	//定义适配者BinarySearch对象

    @Override
    public int[] sort(int[] array) {
        return	sortObj.quickSort(array);	//调用适配者类QuickSort的排序方法
    }

    @Override
    public int search(int[] array, int key) {
        return	searchObj.binarySearch(array,key);	//调用适配者类BinarySearch的查
    }

    public OperationAdapter() {
        this.sortObj = new QuickSort();
        this.searchObj =new BinarySearch();




    }
}
