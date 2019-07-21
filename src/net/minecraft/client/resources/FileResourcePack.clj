(ns net.minecraft.client.resources.FileResourcePack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources FileResourcePack]))

(defn ->file-resource-pack
  "Constructor.

  resource-pack-file-in - `java.io.File`"
  (^FileResourcePack [^java.io.File resource-pack-file-in]
    (new FileResourcePack resource-pack-file-in)))

(def *-entry-name-splitter
  "Static Constant.

  type: com.google.common.base.Splitter"
  FileResourcePack/ENTRY_NAME_SPLITTER)

(defn has-resource-name?
  "name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FileResourcePack this ^java.lang.String name]
    (-> this (.hasResourceName name))))

(defn get-resource-domains
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^FileResourcePack this]
    (-> this (.getResourceDomains))))

(defn close
  "throws: java.io.IOException"
  ([^FileResourcePack this]
    (-> this (.close))))

