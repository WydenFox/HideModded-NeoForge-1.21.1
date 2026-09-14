package github.ciluqwq.hidemodded;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue HIDE_MODDED = BUILDER
            .comment("Whether to hide the asterisk in the title bar and '(Modded)' in the main menu")
            .translation("hidemodded.configuration.hideModded")
            .define("hideModded", true);

    public static final ModConfigSpec.BooleanValue HIDE_MOD_COUNTER = BUILDER
            .comment("Whether to hide the mod counter in the main menu branding")
            .translation("hidemodded.configuration.hideModCounter")
            .define("hideModCounter", true);

    public static final ModConfigSpec.BooleanValue HIDE_ALL_BRANDING = BUILDER
            .comment("Whether to hide all NeoForge branding in the main menu (leaving only vanilla Minecraft version text)")
            .translation("hidemodded.configuration.hideAllBranding")
            .define("hideAllBranding", true);

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean shouldHideModded() {
        try {
            return HIDE_MODDED.get();
        } catch (Exception ignored) {
            return true;
        }
    }

    public static boolean shouldHideModCounter() {
        try {
            return HIDE_MOD_COUNTER.get();
        } catch (Exception ignored) {
            return true;
        }
    }

    public static boolean shouldHideAllBranding() {
        try {
            return HIDE_ALL_BRANDING.get();
        } catch (Exception ignored) {
            return true;
        }
    }
}
