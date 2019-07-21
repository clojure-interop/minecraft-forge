(ns net.minecraft.client.resources.data.LanguageMetadataSection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources.data LanguageMetadataSection]))

(defn ->language-metadata-section
  "Constructor.

  languages-in - `java.util.Collection`"
  (^LanguageMetadataSection [^java.util.Collection languages-in]
    (new LanguageMetadataSection languages-in)))

(defn get-languages
  "returns: `java.util.Collection<net.minecraft.client.resources.Language>`"
  (^java.util.Collection [^LanguageMetadataSection this]
    (-> this (.getLanguages))))

