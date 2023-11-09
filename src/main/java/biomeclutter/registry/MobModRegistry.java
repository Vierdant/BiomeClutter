package biomeclutter.registry;

import biomeclutter.entity.friendly.RollingTumbleweed;
import necesse.engine.registries.MobRegistry;

public class MobModRegistry {

    public static void registerMobs() {
        MobRegistry.registerMob("rollingtumbleweed", RollingTumbleweed.class, false);
    }
}
