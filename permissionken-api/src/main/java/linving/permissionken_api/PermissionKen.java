package linving.permissionken_api;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * @Author linyong
 * @Date 2016/10/4
 * @Time 22:02
 */
public class PermissionKen {
    private static PermissionKen instance = new PermissionKen();

    public static PermissionKen getInstance() {
        return instance;
    }

    private PermissionKen() {

    }

    /**
     * @param activity
     * @param permissions
     * @param requestCode
     */
    public void requestPermissions(Activity activity, String[] permissions, int requestCode) {

    }

    /**
     * @param fragment
     * @param permissions
     * @param requestCode
     */
    public void requestPermissions(Fragment fragment, String[] permissions, int requestCode) {

    }



}
