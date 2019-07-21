(ns net.minecraft.util.text.translation.LanguageMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text.translation LanguageMap]))

(defn ->language-map
  "Constructor."
  (^LanguageMap []
    (new LanguageMap )))

(defn *inject
  "inputstream - `java.io.InputStream`"
  ([^java.io.InputStream inputstream]
    (LanguageMap/inject inputstream)))

(defn *parse-lang-file
  "inputstream - `java.io.InputStream`

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^java.io.InputStream inputstream]
    (LanguageMap/parseLangFile inputstream)))

(defn *replace-with
  "p-135063-0 - `java.util.Map`"
  ([^java.util.Map p-135063-0]
    (LanguageMap/replaceWith p-135063-0)))

(defn translate-key
  "key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^LanguageMap this ^java.lang.String key]
    (-> this (.translateKey key))))

(defn translate-key-format
  "key - `java.lang.String`
  format - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^LanguageMap this ^java.lang.String key ^java.lang.Object format]
    (-> this (.translateKeyFormat key format))))

(defn key-translated?
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^LanguageMap this ^java.lang.String key]
    (-> this (.isKeyTranslated key))))

(defn get-last-update-time-in-milliseconds
  "returns: `long`"
  (^Long [^LanguageMap this]
    (-> this (.getLastUpdateTimeInMilliseconds))))

