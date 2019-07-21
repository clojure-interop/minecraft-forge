(ns net.minecraft.client.resources.SimpleReloadableResourceManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources SimpleReloadableResourceManager]))

(defn ->simple-reloadable-resource-manager
  "Constructor.

  rm-metadata-serializer-in - `net.minecraft.client.resources.data.MetadataSerializer`"
  (^SimpleReloadableResourceManager [^net.minecraft.client.resources.data.MetadataSerializer rm-metadata-serializer-in]
    (new SimpleReloadableResourceManager rm-metadata-serializer-in)))

(defn reload-resource-pack
  "resource-pack - `net.minecraft.client.resources.IResourcePack`"
  ([^SimpleReloadableResourceManager this ^net.minecraft.client.resources.IResourcePack resource-pack]
    (-> this (.reloadResourcePack resource-pack))))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^SimpleReloadableResourceManager this]
    (-> this (.getResourceDomains))))

(defn get-resource
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.client.resources.IResource`

  throws: java.io.IOException"
  (^net.minecraft.client.resources.IResource [^SimpleReloadableResourceManager this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getResource location))))

(defn get-all-resources
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.util.List<net.minecraft.client.resources.IResource>`

  throws: java.io.IOException"
  (^java.util.List [^SimpleReloadableResourceManager this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getAllResources location))))

(defn reload-resources
  "resources-packs-list - `java.util.List`"
  ([^SimpleReloadableResourceManager this ^java.util.List resources-packs-list]
    (-> this (.reloadResources resources-packs-list))))

(defn register-reload-listener
  "reload-listener - `net.minecraft.client.resources.IResourceManagerReloadListener`"
  ([^SimpleReloadableResourceManager this ^net.minecraft.client.resources.IResourceManagerReloadListener reload-listener]
    (-> this (.registerReloadListener reload-listener))))

