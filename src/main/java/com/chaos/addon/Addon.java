package com.chaos.addon;

import com.chaos.addon.commands.PingPong;
import com.chaos.addon.hud.Watermark;
import com.chaos.addon.modules.ModuleExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category Utility = new Category("Utility");
    public static final HudGroup HUD_GROUP = new HudGroup("Chaos");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Chaos");

        // Modules
        Modules.get().add(new ModuleExample());

        // Commands
        Commands.add(new PingPong());

        // HUD
        Hud.get().register(Watermark.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(Utility);
    }

    @Override
    public String getPackage() {
        return "com.chaos.addon";
    }
}
