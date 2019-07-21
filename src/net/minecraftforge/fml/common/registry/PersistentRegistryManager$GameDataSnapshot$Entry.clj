(ns net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot$Entry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry PersistentRegistryManager$GameDataSnapshot$Entry]))

(defn ->entry
  "Constructor.

  ids - `java.util.Map`
  substitutions - `java.util.Set`
  aliases - `java.util.Map`
  blocked - `java.util.Set`
  dummies - `java.util.Set`"
  (^PersistentRegistryManager$GameDataSnapshot$Entry [^java.util.Map ids ^java.util.Set substitutions ^java.util.Map aliases ^java.util.Set blocked ^java.util.Set dummies]
    (new PersistentRegistryManager$GameDataSnapshot$Entry ids substitutions aliases blocked dummies))
  (^PersistentRegistryManager$GameDataSnapshot$Entry [^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry registry]
    (new PersistentRegistryManager$GameDataSnapshot$Entry registry))
  (^PersistentRegistryManager$GameDataSnapshot$Entry []
    (new PersistentRegistryManager$GameDataSnapshot$Entry )))

(defn ids
  "Instance Constant.

  type: java.util.Map<net.minecraft.util.ResourceLocation,java.lang.Integer>"
  (^java.util.Map [^PersistentRegistryManager$GameDataSnapshot$Entry this]
    (-> this .-ids)))

(defn substitutions
  "Instance Constant.

  type: java.util.Set<net.minecraft.util.ResourceLocation>"
  (^java.util.Set [^PersistentRegistryManager$GameDataSnapshot$Entry this]
    (-> this .-substitutions)))

(defn aliases
  "Instance Constant.

  type: java.util.Map<net.minecraft.util.ResourceLocation,net.minecraft.util.ResourceLocation>"
  (^java.util.Map [^PersistentRegistryManager$GameDataSnapshot$Entry this]
    (-> this .-aliases)))

(defn blocked
  "Instance Constant.

  type: java.util.Set<java.lang.Integer>"
  (^java.util.Set [^PersistentRegistryManager$GameDataSnapshot$Entry this]
    (-> this .-blocked)))

(defn dummied
  "Instance Constant.

  type: java.util.Set<net.minecraft.util.ResourceLocation>"
  (^java.util.Set [^PersistentRegistryManager$GameDataSnapshot$Entry this]
    (-> this .-dummied)))

