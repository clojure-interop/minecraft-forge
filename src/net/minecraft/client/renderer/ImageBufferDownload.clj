(ns net.minecraft.client.renderer.ImageBufferDownload
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer ImageBufferDownload]))

(defn ->image-buffer-download
  "Constructor."
  (^ImageBufferDownload []
    (new ImageBufferDownload )))

(defn parse-user-skin
  "image - `java.awt.image.BufferedImage`

  returns: `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^ImageBufferDownload this ^java.awt.image.BufferedImage image]
    (-> this (.parseUserSkin image))))

(defn skin-available
  ""
  ([^ImageBufferDownload this]
    (-> this (.skinAvailable))))

