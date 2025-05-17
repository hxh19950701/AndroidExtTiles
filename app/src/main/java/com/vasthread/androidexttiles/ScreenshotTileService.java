package com.vasthread.androidexttiles;

import android.service.quicksettings.TileService;

import java.io.OutputStream;

public class ScreenshotTileService extends TileService {

    @Override
    public void onClick() {
        try {
            Process process = Runtime.getRuntime().exec("su");
            try (OutputStream output = process.getOutputStream()) {
                output.write("service call statusbar 2\n".getBytes());
                output.write("input keycombination -t 1000 KEYCODE_VOLUME_DOWN KEYCODE_POWER\n".getBytes());
                output.write("exit\n".getBytes());
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
