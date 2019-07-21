(ns net.minecraft.client.resources.data.PackMetadataSection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data PackMetadataSection]))

(defn ->pack-metadata-section
  "Constructor.

  pack-description-in - `net.minecraft.util.text.ITextComponent`
  pack-format-in - `int`"
  (^PackMetadataSection [^net.minecraft.util.text.ITextComponent pack-description-in ^Integer pack-format-in]
    (new PackMetadataSection pack-description-in pack-format-in)))

(defn get-pack-description
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^PackMetadataSection this]
    (-> this (.getPackDescription))))

(defn get-pack-format
  "returns: `int`"
  (^Integer [^PackMetadataSection this]
    (-> this (.getPackFormat))))

