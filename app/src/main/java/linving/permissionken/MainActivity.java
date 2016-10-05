package linving.permissionken;

import android.Manifest;
import android.os.Bundle;
import android.support.v4.content.PermissionChecker;
import android.support.v7.app.AppCompatActivity;

import linving.permission_annotation.PermissionFail;
import linving.permission_annotation.PermissionSuccess;
import linving.permissionken_api.PermissionKen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PermissionKen.getInstance().requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS}, 100);
    }

    @PermissionFail(requestCode = 100)
    protected void onReadContactsFail() {
    }

    @PermissionSuccess(requestCode = 100)
    protected void onReadContactsSuccess() {

    }

}
