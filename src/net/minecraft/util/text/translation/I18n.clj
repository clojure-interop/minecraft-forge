(ns net.minecraft.util.text.translation.I18n
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text.translation I18n]))

(defn ->i-18n
  "Constructor.

  Deprecated."
  (^I18n []
    (new I18n )))

(defn *translate-to-local
  "Deprecated.

  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String key]
    (I18n/translateToLocal key)))

(defn *translate-to-local-formatted
  "Deprecated.

  key - `java.lang.String`
  format - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String key ^java.lang.Object format]
    (I18n/translateToLocalFormatted key format)))

(defn *translate-to-fallback
  "Deprecated.

  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String key]
    (I18n/translateToFallback key)))

(defn *can-translate?
  "Deprecated.

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String key]
    (I18n/canTranslate key)))

(defn *get-last-translation-update-time-in-milliseconds
  "Deprecated.

  returns: `long`"
  (^Long []
    (I18n/getLastTranslationUpdateTimeInMilliseconds )))

