package com.giuseppesorce.snakelib;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * @author Giuseppe Sorce
 */

public final class SnakeMessage {


    public static Snackbar message(View view, String message, int duration) {
        Snackbar snake = Snackbar.make(view, message, duration);
        snake.show();
        return snake;
    }
}
