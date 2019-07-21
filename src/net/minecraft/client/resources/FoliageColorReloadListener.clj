(ns net.minecraft.client.resources.FoliageColorReloadListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources FoliageColorReloadListener]))

(defn ->foliage-color-reload-listener
  "Constructor."
  (^FoliageColorReloadListener []
    (new FoliageColorReloadListener )))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^FoliageColorReloadListener this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

