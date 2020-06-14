package com.github.grishberg.androidemulatormanager.avdmanager;

import com.github.grishberg.androidemulatormanager.PreferenceContext;
import com.github.grishberg.androidemulatormanager.utils.Logger;

/**
 * For old sdk android tools wrapper.
 */
public class UnixAndroidManagerWrapper extends AvdManagerWrapper {
    public UnixAndroidManagerWrapper(PreferenceContext context,
                                     HardwareManager hardwareManager,
                                     SdkManager sdkManager,
                                     Logger logger) {
        super(context, "/tools/android",
                hardwareManager, sdkManager, logger);
    }
}
