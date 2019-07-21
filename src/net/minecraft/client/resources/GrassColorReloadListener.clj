(ns net.minecraft.client.resources.GrassColorReloadListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources GrassColorReloadListener]))

(defn ->grass-color-reload-listener
  "Constructor."
  (^GrassColorReloadListener []
    (new GrassColorReloadListener )))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^GrassColorReloadListener this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

