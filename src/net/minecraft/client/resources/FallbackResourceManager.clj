(ns net.minecraft.client.resources.FallbackResourceManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources FallbackResourceManager]))

(defn ->fallback-resource-manager
  "Constructor.

  frm-metadata-serializer-in - `net.minecraft.client.resources.data.MetadataSerializer`"
  (^FallbackResourceManager [^net.minecraft.client.resources.data.MetadataSerializer frm-metadata-serializer-in]
    (new FallbackResourceManager frm-metadata-serializer-in)))

(defn add-resource-pack
  "resource-pack - `net.minecraft.client.resources.IResourcePack`"
  ([^FallbackResourceManager this ^net.minecraft.client.resources.IResourcePack resource-pack]
    (-> this (.addResourcePack resource-pack))))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^FallbackResourceManager this]
    (-> this (.getResourceDomains))))

(defn get-resource
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.client.resources.IResource`

  throws: java.io.IOException"
  (^net.minecraft.client.resources.IResource [^FallbackResourceManager this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getResource location))))

(defn get-all-resources
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.util.List<net.minecraft.client.resources.IResource>`

  throws: java.io.IOException"
  (^java.util.List [^FallbackResourceManager this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getAllResources location))))

