(ns net.minecraft.client.resources.data.FontMetadataSection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data FontMetadataSection]))

(defn ->font-metadata-section
  "Constructor.

  char-widths-in - `float[]`
  char-lefts-in - `float[]`
  char-spacings-in - `float[]`"
  (^FontMetadataSection [char-widths-in char-lefts-in char-spacings-in]
    (new FontMetadataSection char-widths-in char-lefts-in char-spacings-in)))

