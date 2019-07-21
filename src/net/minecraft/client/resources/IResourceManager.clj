(ns net.minecraft.client.resources.IResourceManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources IResourceManager]))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^IResourceManager this]
    (-> this (.getResourceDomains))))

(defn get-resource
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.client.resources.IResource`

  throws: java.io.IOException"
  (^net.minecraft.client.resources.IResource [^IResourceManager this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getResource location))))

(defn get-all-resources
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.util.List<net.minecraft.client.resources.IResource>`

  throws: java.io.IOException"
  (^java.util.List [^IResourceManager this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getAllResources location))))

