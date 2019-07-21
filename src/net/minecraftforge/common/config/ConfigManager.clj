(ns net.minecraftforge.common.config.ConfigManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config ConfigManager]))

(defn ->config-manager
  "Constructor."
  (^ConfigManager []
    (new ConfigManager )))

(defn *load-data
  "data - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  ([^net.minecraftforge.fml.common.discovery.ASMDataTable data]
    (ConfigManager/loadData data)))

(defn *load
  "modid - `java.lang.String`
  type - `net.minecraftforge.common.config.Config$Type`"
  ([^java.lang.String modid ^net.minecraftforge.common.config.Config$Type type]
    (ConfigManager/load modid type)))

