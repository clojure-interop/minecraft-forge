(ns net.minecraft.client.renderer.IImageBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer IImageBuffer]))

(defn parse-user-skin
  "image - `java.awt.image.BufferedImage`

  returns: `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^IImageBuffer this ^java.awt.image.BufferedImage image]
    (-> this (.parseUserSkin image))))

(defn skin-available
  ""
  ([^IImageBuffer this]
    (-> this (.skinAvailable))))

