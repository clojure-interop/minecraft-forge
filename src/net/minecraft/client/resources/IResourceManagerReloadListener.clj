(ns net.minecraft.client.resources.IResourceManagerReloadListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources IResourceManagerReloadListener]))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^IResourceManagerReloadListener this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

