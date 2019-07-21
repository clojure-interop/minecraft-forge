(ns net.minecraft.client.resources.LanguageManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources LanguageManager]))

(defn ->language-manager
  "Constructor.

  the-metadata-serializer-in - `net.minecraft.client.resources.data.MetadataSerializer`
  current-language-in - `java.lang.String`"
  (^LanguageManager [^net.minecraft.client.resources.data.MetadataSerializer the-metadata-serializer-in ^java.lang.String current-language-in]
    (new LanguageManager the-metadata-serializer-in current-language-in)))

(defn parse-language-metadata
  "resources-packs - `java.util.List`"
  ([^LanguageManager this ^java.util.List resources-packs]
    (-> this (.parseLanguageMetadata resources-packs))))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^LanguageManager this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn current-locale-unicode?
  "returns: `boolean`"
  (^Boolean [^LanguageManager this]
    (-> this (.isCurrentLocaleUnicode))))

(defn current-language-bidirectional?
  "returns: `boolean`"
  (^Boolean [^LanguageManager this]
    (-> this (.isCurrentLanguageBidirectional))))

(defn set-current-language
  "current-language-in - `net.minecraft.client.resources.Language`"
  ([^LanguageManager this ^net.minecraft.client.resources.Language current-language-in]
    (-> this (.setCurrentLanguage current-language-in))))

(defn get-current-language
  "returns: `net.minecraft.client.resources.Language`"
  (^net.minecraft.client.resources.Language [^LanguageManager this]
    (-> this (.getCurrentLanguage))))

(defn get-languages
  "returns: `java.util.SortedSet<net.minecraft.client.resources.Language>`"
  (^java.util.SortedSet [^LanguageManager this]
    (-> this (.getLanguages))))

