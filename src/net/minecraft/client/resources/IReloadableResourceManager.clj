(ns net.minecraft.client.resources.IReloadableResourceManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources IReloadableResourceManager]))

(defn reload-resources
  "resources-packs-list - `java.util.List`"
  ([^IReloadableResourceManager this ^java.util.List resources-packs-list]
    (-> this (.reloadResources resources-packs-list))))

(defn register-reload-listener
  "reload-listener - `net.minecraft.client.resources.IResourceManagerReloadListener`"
  ([^IReloadableResourceManager this ^net.minecraft.client.resources.IResourceManagerReloadListener reload-listener]
    (-> this (.registerReloadListener reload-listener))))

