(ns net.minecraft.client.resources.I18n
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources I18n]))

(defn ->i-18n
  "Constructor."
  (^I18n []
    (new I18n )))

(defn *format
  "translate-key - `java.lang.String`
  parameters - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String translate-key ^java.lang.Object parameters]
    (I18n/format translate-key parameters)))

(defn *has-key?
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String key]
    (I18n/hasKey key)))

