package modle;

/**
 * Created by zl on 2017/4/25.
 */

public interface Imodle {

    void login(String userName,String password,LoginListener listener);
}
