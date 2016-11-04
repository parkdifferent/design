package AbstractFactory;

/**
 * Created by tianf on 2016/8/12.
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory springSkinFactory=new SpringSkinFactory();
        Button springButton=springSkinFactory.createButton();
        ComboBox springComboBox= springSkinFactory.createComboBox();
        TextField springTextField=springSkinFactory.createTextField();
        springButton.display();
        springComboBox.display();
        springTextField.display();
    }
}
