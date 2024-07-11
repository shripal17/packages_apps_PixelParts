/*
 * Copyright (C) 2023-2024 The Evolution X Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.evolution.pixelparts;

public class Constants {

    // Charge control
    public static final String KEY_CHARGE_CONTROL = "charge_control";
    public static final String KEY_STOP_CHARGING = "stop_charging";
    public static final String KEY_START_CHARGING = "start_charging";
    public static final String NODE_STOP_CHARGING = "/sys/devices/platform/google,charger/charge_stop_level";
    public static final String NODE_START_CHARGING = "/sys/devices/platform/google,charger/charge_start_level";
    public static final String DEFAULT_STOP_CHARGING = "100";
    public static final String DEFAULT_START_CHARGING = "0";

    // Pixel torch
    public static final String KEY_PIXEL_TORCH_CYCLE_MODES = "pixel_torch_cycle_modes";
    public static final String KEY_PIXEL_TORCH_BUTTON_SERVICE = "pixel_torch_button_service";
    public static final String KEY_PIXEL_TORCH_STATE = "pixel_torch_state";
    public static final String KEY_PIXEL_TORCH_STRENGTH_1 = "pixel_torch_strength_1";
    public static final String KEY_PIXEL_TORCH_STRENGTH_2 = "pixel_torch_strength_2";
    public static final String KEY_PIXEL_TORCH_STRENGTH_3 = "pixel_torch_strength_3";

    // AutoHbm
    public static final String KEY_AUTO_HBM = "auto_hbm";
    public static final String KEY_AUTO_HBM_THRESHOLD = "auto_hbm_threshold";
    public static final String KEY_AUTO_HBM_ENABLE_TIME = "auto_hbm_enable_time";
    public static final String KEY_AUTO_HBM_DISABLE_TIME = "auto_hbm_disable_time";
    public static final String KEY_CURRENT_LUX_LEVEL = "current_lux_level";
    public static final String NODE_HBM = "/sys/class/backlight/panel0-backlight/hbm_mode";

    // Saturation
    public static final String KEY_SATURATION = "saturation";
    public static final String KEY_SATURATION_PREVIEW = "saturation_preview";
}
