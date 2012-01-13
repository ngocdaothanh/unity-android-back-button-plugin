package my.app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.KeyEvent;

import com.unity3d.player.UnityPlayerActivity;

public class BackButtonActivity extends UnityPlayerActivity {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Resources res = getResources();

            new AlertDialog.Builder(this)
                .setTitle(res.getString(R.string.quit_title))
                .setMessage(res.getString(R.string.quit_question))
                .setPositiveButton(res.getString(R.string.quit_yes),
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dlg, int which) {
                            System.exit(0);
                        }
                    })
                .setNegativeButton(res.getString(R.string.quit_no),
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dlg, int which) {
                        }
                    }).show();
        }
        return super.onKeyDown(keyCode, event);
    }
}
