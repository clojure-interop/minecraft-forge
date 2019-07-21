(ns net.minecraft.client.renderer.texture.PngSizeInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture PngSizeInfo]))

(defn ->png-size-info
  "Constructor.

  stream - `java.io.InputStream`

  throws: java.io.IOException"
  (^PngSizeInfo [^java.io.InputStream stream]
    (new PngSizeInfo stream)))

(defn png-width
  "Instance Constant.

  type: int"
  (^Integer [^PngSizeInfo this]
    (-> this .-pngWidth)))

(defn png-height
  "Instance Constant.

  type: int"
  (^Integer [^PngSizeInfo this]
    (-> this .-pngHeight)))

(defn *make-from-resource
  "resource - `net.minecraft.client.resources.IResource`

  returns: `net.minecraft.client.renderer.texture.PngSizeInfo`

  throws: java.io.IOException"
  (^net.minecraft.client.renderer.texture.PngSizeInfo [^net.minecraft.client.resources.IResource resource]
    (PngSizeInfo/makeFromResource resource)))

