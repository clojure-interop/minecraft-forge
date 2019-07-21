(ns net.minecraftforge.fml.client.FMLFileResourcePack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client FMLFileResourcePack]))

(defn ->fml-file-resource-pack
  "Constructor.

  container - `net.minecraftforge.fml.common.ModContainer`"
  (^FMLFileResourcePack [^net.minecraftforge.fml.common.ModContainer container]
    (new FMLFileResourcePack container)))

(defn get-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLFileResourcePack this]
    (-> this (.getPackName))))

(defn get-pack-image
  "returns: `java.awt.image.BufferedImage`

  throws: java.io.IOException"
  (^java.awt.image.BufferedImage [^FMLFileResourcePack this]
    (-> this (.getPackImage))))

(defn get-fml-container
  "returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^FMLFileResourcePack this]
    (-> this (.getFMLContainer))))

