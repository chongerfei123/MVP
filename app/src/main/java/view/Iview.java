package view;

/**
 * Created by zl on 2017/4/25.
 */

public interface Iview {

    void showProgress();
    void hideProgress();
    void showloginsucceed();
    void showloginError(int ErrorCode);
    String getUserName();
    String getPassword();
}
