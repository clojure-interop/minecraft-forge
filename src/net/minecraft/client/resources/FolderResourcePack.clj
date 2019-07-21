(ns net.minecraft.client.resources.FolderResourcePack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources FolderResourcePack]))

(defn ->folder-resource-pack
  "Constructor.

  resource-pack-file-in - `java.io.File`"
  (^FolderResourcePack [^java.io.File resource-pack-file-in]
    (new FolderResourcePack resource-pack-file-in)))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^FolderResourcePack this]
    (-> this (.getResourceDomains))))

