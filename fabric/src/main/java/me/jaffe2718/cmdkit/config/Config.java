package me.jaffe2718.cmdkit.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class Config extends MidnightConfig {
    @Entry() public static int executionPort = 27001;
    @Entry() public static int suggestionPort = 27002;
    @Entry() public static int packManagementPort = 27003;
}
