(ns net.minecraft.client.resources.ResourcePackFileNotFoundException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources ResourcePackFileNotFoundException]))

(defn ->resource-pack-file-not-found-exception
  "Constructor.

  resource-pack - `java.io.File`
  file-name - `java.lang.String`"
  (^ResourcePackFileNotFoundException [^java.io.File resource-pack ^java.lang.String file-name]
    (new ResourcePackFileNotFoundException resource-pack file-name)))

