(ns net.minecraft.init.Bootstrap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.init Bootstrap]))

(defn ->bootstrap
  "Constructor."
  (^Bootstrap []
    (new Bootstrap )))

(def *-sysout
  "Static Constant.

  type: java.io.PrintStream"
  Bootstrap/SYSOUT)

(defn *registered?
  "returns: `boolean`"
  (^Boolean []
    (Bootstrap/isRegistered )))

(defn *register
  ""
  ([]
    (Bootstrap/register )))

(defn *print-to-sysout
  "message - `java.lang.String`"
  ([^java.lang.String message]
    (Bootstrap/printToSYSOUT message)))

