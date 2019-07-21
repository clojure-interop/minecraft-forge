(ns net.minecraftforge.fml.common.registry.LegacyNamespacedRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry LegacyNamespacedRegistry]))

(defn ->legacy-namespaced-registry
  "Constructor."
  (^LegacyNamespacedRegistry []
    (new LegacyNamespacedRegistry )))

(defn get-object
  "name - `net.minecraft.util.ResourceLocation`

  returns: `V`"
  ([^LegacyNamespacedRegistry this ^net.minecraft.util.ResourceLocation name]
    (-> this (.getObject name))))

(defn add-legacy-name
  "old-name - `net.minecraft.util.ResourceLocation`
  new-name - `net.minecraft.util.ResourceLocation`"
  ([^LegacyNamespacedRegistry this ^net.minecraft.util.ResourceLocation old-name ^net.minecraft.util.ResourceLocation new-name]
    (-> this (.addLegacyName old-name new-name))))

