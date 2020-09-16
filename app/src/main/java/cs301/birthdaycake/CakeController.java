package cs301.birthdaycake;


import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
    private CakeView cakeview;
    private CakeModel cakemodel;

    public CakeController(CakeView cake) {
        cakeview = cake;
        cakemodel = cakeview.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("button", "Click");
        cakemodel.lit = false;
        cakeview.invalidate();
    }

}
