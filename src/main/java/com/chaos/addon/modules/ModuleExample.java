package com.chaos.addon.modules;

import com.chaos.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(Addon.Utility, "example", "An example module in a custom category.");
    }
}
