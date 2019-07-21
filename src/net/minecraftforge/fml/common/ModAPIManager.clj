(ns net.minecraftforge.fml.common.ModAPIManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ModAPIManager]))

(defn ->mod-api-manager
  "Constructor."
  (^ModAPIManager []
    (new ModAPIManager )))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.fml.common.ModAPIManager"
  ModAPIManager/INSTANCE)

(defn register-data-table-and-parse-api
  "data-table - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  ([^ModAPIManager this ^net.minecraftforge.fml.common.discovery.ASMDataTable data-table]
    (-> this (.registerDataTableAndParseAPI data-table))))

(defn manage-api
  "mod-class-loader - `net.minecraftforge.fml.common.ModClassLoader`
  discoverer - `net.minecraftforge.fml.common.discovery.ModDiscoverer`"
  ([^ModAPIManager this ^net.minecraftforge.fml.common.ModClassLoader mod-class-loader ^net.minecraftforge.fml.common.discovery.ModDiscoverer discoverer]
    (-> this (.manageAPI mod-class-loader discoverer))))

(defn inject-api-mod-containers
  "mods - `java.util.List`
  name-lookup - `java.util.Map`"
  ([^ModAPIManager this ^java.util.List mods ^java.util.Map name-lookup]
    (-> this (.injectAPIModContainers mods name-lookup))))

(defn cleanup-api-containers
  "mods - `java.util.List`"
  ([^ModAPIManager this ^java.util.List mods]
    (-> this (.cleanupAPIContainers mods))))

(defn has-api?
  "mod-id - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ModAPIManager this ^java.lang.String mod-id]
    (-> this (.hasAPI mod-id))))

(defn get-api-list
  "returns: `java.lang.Iterable<? extends net.minecraftforge.fml.common.ModContainer>`"
  ([^ModAPIManager this]
    (-> this (.getAPIList))))

