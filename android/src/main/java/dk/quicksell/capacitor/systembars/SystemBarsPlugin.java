package dk.quicksell.capacitor.systembars;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "SystemBars")
public class SystemBarsPlugin extends Plugin {
    @PluginMethod
    public void hideStatusbar() {
        getBridge().executeOnMainThread(
            new Runnable() {
                @Override
                public void run() {
                    Window window = getActivity().getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                    call.resolve();
                }
            }
        );
    }

    @PluginMethod
    public void showStatusbar() {
        getBridge().executeOnMainThread(
            new Runnable() {
                @Override
                public void run() {
                    Window window = getActivity().getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                    call.resolve();
                }
            }
        );
    }

        @PluginMethod
    public void hideNaigationbar() {
        getBridge().executeOnMainThread(
            new Runnable() {
                @Override
                public void run() {
                    Window window = getActivity().getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                    call.resolve();
                }
            }
        );
    }

    @PluginMethod
    public void showNaigationbar() {
        getBridge().executeOnMainThread(
            new Runnable() {
                @Override
                public void run() {
                    Window window = getActivity().getWindow();
                    window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                    call.resolve();
                }
            }
        );
    }
}
