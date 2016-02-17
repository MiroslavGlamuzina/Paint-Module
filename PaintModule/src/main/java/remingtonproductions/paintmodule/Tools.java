package remingtonproductions.paintmodule;

import android.view.KeyEvent;
import android.view.View;

import java.util.UUID;

public class Tools {


    /**
     * <b>getFileNameDrawing()</b></br>
     * Returns randomly generatated file name specific for <b>drawing</b> files.
     *
     * @return
     */
    public static String getFileNameDrawing() {
        return "DRAWING_" + UUID.randomUUID().toString().replaceAll("-", "").replaceAll(":", "-") + ".jpg";
    }

    /**
     * <b>backButton(View v)</b></br>
     * Simulates a <i><b>Back Button KeyEvent</b></i> occurance. Currently used
     * for returning to the main view inside of the notes main activity.
     *
     * @param v
     */
    public static void backButton(View v) {
        v.getRootView().dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));
        v.getRootView().dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_BACK));
    }
}
