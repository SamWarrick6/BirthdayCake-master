package cs301.birthdaycake;



public class CakeController {
    private CakeView cakeview;
    private CakeModel cakemodel;

    public CakeController(CakeView cake) {
        cakeview = cake;
        cakemodel = getCakeModel;
    }
}
