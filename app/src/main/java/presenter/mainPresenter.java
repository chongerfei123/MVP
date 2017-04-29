package presenter;

import modle.Imodle;
import modle.LoginListener;
import modle.mainModle;
import view.Iview;

/**
 * Created by zl on 2017/4/25.
 */

public class mainPresenter extends BasePresenter<Iview> {
    private Iview iview;
    private Imodle imodle;
    public mainPresenter(Iview iview) {
        this.iview = iview;
        imodle = new mainModle();
    }


    public void login() {
        iview.showProgress();
        String userName = iview.getUserName();
        String password = iview.getPassword();
        imodle.login(userName, password, new LoginListener() {
            @Override
            public void onSucceed() {
                iview.hideProgress();
                iview.showloginsucceed();
            }

            @Override
            public void onError(int ErrorCode) {
                iview.showloginError(ErrorCode);
                iview.hideProgress();
            }
        });
    }
}
