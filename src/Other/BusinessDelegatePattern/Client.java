package Other.BusinessDelegatePattern;

/**
 * Created by tianf on 2016/8/19.
 */

//创建客户端。
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
