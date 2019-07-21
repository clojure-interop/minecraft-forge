(ns net.minecraft.client.resources.Language
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources Language]))

(defn ->language
  "Constructor.

  language-code-in - `java.lang.String`
  region-in - `java.lang.String`
  name-in - `java.lang.String`
  bidirectional-in - `boolean`"
  (^Language [^java.lang.String language-code-in ^java.lang.String region-in ^java.lang.String name-in ^Boolean bidirectional-in]
    (new Language language-code-in region-in name-in bidirectional-in)))

(defn get-language-code
  "returns: `java.lang.String`"
  (^java.lang.String [^Language this]
    (-> this (.getLanguageCode))))

(defn bidirectional?
  "returns: `boolean`"
  (^Boolean [^Language this]
    (-> this (.isBidirectional))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Language this]
    (-> this (.toString))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Language this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Language this]
    (-> this (.hashCode))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.client.resources.Language`

  returns: `int`"
  (^Integer [^Language this ^net.minecraft.client.resources.Language p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

(defn get-java-locale
  "returns: `java.util.Locale`"
  (^java.util.Locale [^Language this]
    (-> this (.getJavaLocale))))

