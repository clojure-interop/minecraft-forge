(ns net.minecraftforge.fml.common.registry.IForgeRegistry$ClearCallback
  "Callback fired when the registry is cleared. This is done before a registry is reloaded from client
  or server."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IForgeRegistry$ClearCallback]))

(defn on-clear
  "is - `net.minecraftforge.fml.common.registry.IForgeRegistry`
  slaveset - `java.util.Map`"
  ([^IForgeRegistry$ClearCallback this ^net.minecraftforge.fml.common.registry.IForgeRegistry is ^java.util.Map slaveset]
    (-> this (.onClear is slaveset))))

