package AbstractFactory;

/**
 * Created by tianf on 2016/8/12.
 */
public interface SkinFactory {

    public	Button	createButton();
    public	TextField	createTextField();
    public	ComboBox	createComboBox();
}
