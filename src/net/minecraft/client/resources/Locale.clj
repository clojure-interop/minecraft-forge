(ns net.minecraft.client.resources.Locale
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources Locale]))

(defn ->locale
  "Constructor."
  (^Locale []
    (new Locale )))

(defn load-locale-data-files
  "resource-manager - `net.minecraft.client.resources.IResourceManager`
  language-list - `java.util.List`"
  ([^Locale this ^net.minecraft.client.resources.IResourceManager resource-manager ^java.util.List language-list]
    (-> this (.loadLocaleDataFiles resource-manager language-list))))

(defn unicode?
  "returns: `boolean`"
  (^Boolean [^Locale this]
    (-> this (.isUnicode))))

(defn format-message
  "translate-key - `java.lang.String`
  parameters - `java.lang.Object[]`

  returns: `java.lang.String`"
  (^java.lang.String [^Locale this ^java.lang.String translate-key parameters]
    (-> this (.formatMessage translate-key parameters))))

(defn has-key?
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Locale this ^java.lang.String key]
    (-> this (.hasKey key))))

