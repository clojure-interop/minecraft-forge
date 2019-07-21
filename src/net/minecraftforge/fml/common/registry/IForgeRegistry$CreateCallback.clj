(ns net.minecraftforge.fml.common.registry.IForgeRegistry$CreateCallback
  "Callback fired when a registry instance is created. Populate slave maps here."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IForgeRegistry$CreateCallback]))

(defn on-create
  "slaveset - `java.util.Map`
  registries - `com.google.common.collect.BiMap`"
  ([^IForgeRegistry$CreateCallback this ^java.util.Map slaveset ^com.google.common.collect.BiMap registries]
    (-> this (.onCreate slaveset registries))))

