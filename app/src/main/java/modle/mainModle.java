package modle;


import android.os.Handler;

/**
 * Created by zl on 2017/4/25.
 */

public class mainModle implements Imodle {
    private Handler handler = new Handler();

    @Override
    public void login(final String userName, final String password, final LoginListener listener) {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (userName.equals("zhangsan") && password.equals("123")) {
                    listener.onSucceed();
                } else {
                    listener.onError(1);
                }
            }
        }, 2000);


    }
}
