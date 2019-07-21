(ns net.minecraft.client.resources.ResourceIndex
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources ResourceIndex]))

(defn ->resource-index
  "Constructor.

  assets-folder - `java.io.File`
  index-name - `java.lang.String`"
  (^ResourceIndex [^java.io.File assets-folder ^java.lang.String index-name]
    (new ResourceIndex assets-folder index-name)))

(defn get-file
  "location - `net.minecraft.util.ResourceLocation`

  returns: `java.io.File`"
  (^java.io.File [^ResourceIndex this ^net.minecraft.util.ResourceLocation location]
    (-> this (.getFile location))))

(defn file-existing?
  "location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^ResourceIndex this ^net.minecraft.util.ResourceLocation location]
    (-> this (.isFileExisting location))))

(defn get-pack-mcmeta
  "returns: `java.io.File`"
  (^java.io.File [^ResourceIndex this]
    (-> this (.getPackMcmeta))))

