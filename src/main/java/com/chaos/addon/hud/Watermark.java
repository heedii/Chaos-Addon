package com.chaos.addon.hud;

import com.chaos.addon.Addon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class Watermark extends HudElement {
    public static final HudElementInfo<Watermark> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "Watermark", "Watermark", Watermark::new);

    public Watermark() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("Chaos Addon", true), renderer.textHeight(true));

        renderer.text("Chaos Addon", x, y, Color.MAGENTA, true);
    }
}
