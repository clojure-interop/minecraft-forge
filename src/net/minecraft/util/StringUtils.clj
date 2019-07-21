(ns net.minecraft.util.StringUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util StringUtils]))

(defn ->string-utils
  "Constructor."
  (^StringUtils []
    (new StringUtils )))

(defn *ticks-to-elapsed-time
  "ticks - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer ticks]
    (StringUtils/ticksToElapsedTime ticks)))

(defn *strip-control-codes
  "text - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String text]
    (StringUtils/stripControlCodes text)))

(defn *null-or-empty?
  "string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String string]
    (StringUtils/isNullOrEmpty string)))

