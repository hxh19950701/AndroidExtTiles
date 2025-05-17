package com.vasthread.androidexttils;

import android.service.quicksettings.TileService;

import java.io.OutputStream;

public class SleepTileService extends TileService {

    @Override
    public void onClick() {
        try {
            Process process = Runtime.getRuntime().exec("su");
            try (OutputStream output = process.getOutputStream()) {
                output.write("input keyevent KEYCODE_POWER\n".getBytes());
                output.write("exit\n".getBytes());
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
