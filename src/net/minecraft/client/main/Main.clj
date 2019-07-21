(ns net.minecraft.client.main.Main
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.main Main]))

(defn ->main
  "Constructor."
  (^Main []
    (new Main )))

(defn *main
  "p-main-0 - `java.lang.String[]`"
  ([p-main-0]
    (Main/main p-main-0)))

