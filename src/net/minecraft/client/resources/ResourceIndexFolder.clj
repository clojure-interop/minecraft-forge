(ns net.minecraft.client.resources.ResourceIndexFolder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources ResourceIndexFolder]))

(defn ->resource-index-folder
  "Constructor.

  folder - `java.io.File`"
  (^ResourceIndexFolder [^java.io.File folder]
    (new ResourceIndexFolder folder)))

(defn get-file
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.io.File`"
  (^java.io.File [^ResourceIndexFolder this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getFile location))))

(defn get-pack-mcmeta
  "returns: `java.io.File`"
  (^java.io.File [^ResourceIndexFolder this]
    (-> this (.getPackMcmeta))))

