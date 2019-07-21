(ns net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry PersistentRegistryManager$GameDataSnapshot]))

(defn ->game-data-snapshot
  "Constructor."
  (^PersistentRegistryManager$GameDataSnapshot []
    (new PersistentRegistryManager$GameDataSnapshot )))

(defn entries
  "Instance Constant.

  type: java.util.Map<net.minecraft.util.ResourceLocation,net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot$Entry>"
  (^java.util.Map [^PersistentRegistryManager$GameDataSnapshot this]
    (-> this .-entries)))

