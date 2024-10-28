/*
 * Copyright (C) 2023-2024 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.evolution.pixelparts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.evolution.pixelparts.chargecontrol.ChargeControlFragment;
import org.evolution.pixelparts.pixeltorch.PixelTorchActivity;
import org.evolution.pixelparts.pixeltorch.PixelTorchFragment;
import org.evolution.pixelparts.pixeltorch.PixelTorchButtonService;
import org.evolution.pixelparts.pixeltorch.PixelTorchTileService;
import org.evolution.pixelparts.saturation.SaturationFragment;
import org.evolution.pixelparts.utils.ComponentUtils;
import org.evolution.pixelparts.utils.FileUtils;

public class Startup extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();

        // Charge control
        ChargeControlFragment.restoreStartChargingSetting(context);
        ChargeControlFragment.restoreStopChargingSetting(context);

        // PixelTorch
        ComponentUtils.toggleComponent(
                context,
                PixelTorchActivity.class,
                PixelTorchFragment.hasTorch(context)
        );

        ComponentUtils.toggleComponent(
                context,
                PixelTorchButtonService.class,
                PixelTorchFragment.hasTorch(context)
        );

        ComponentUtils.toggleComponent(
                context,
                PixelTorchTileService.class,
                PixelTorchFragment.hasTorch(context)
        );

        // Saturation
        SaturationFragment saturationFragment = new SaturationFragment();
        saturationFragment.restoreSaturationSetting(context);
    }
}
