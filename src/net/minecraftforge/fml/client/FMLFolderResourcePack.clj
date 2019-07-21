(ns net.minecraftforge.fml.client.FMLFolderResourcePack
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client FMLFolderResourcePack]))

(defn ->fml-folder-resource-pack
  "Constructor.

  container - `net.minecraftforge.fml.common.ModContainer`"
  (^FMLFolderResourcePack [^net.minecraftforge.fml.common.ModContainer container]
    (new FMLFolderResourcePack container)))

(defn get-pack-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLFolderResourcePack this]
    (-> this (.getPackName))))

(defn get-pack-image
  "returns: `java.awt.image.BufferedImage`

  throws: java.io.IOException"
  (^java.awt.image.BufferedImage [^FMLFolderResourcePack this]
    (-> this (.getPackImage))))

(defn get-fml-container
  "returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^FMLFolderResourcePack this]
    (-> this (.getFMLContainer))))

