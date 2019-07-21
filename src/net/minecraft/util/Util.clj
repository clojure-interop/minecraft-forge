(ns net.minecraft.util.Util
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util Util]))

(defn ->util
  "Constructor."
  (^Util []
    (new Util )))

(defn *get-os-type
  "returns: `net.minecraft.util.Util$EnumOS`"
  (^net.minecraft.util.Util$EnumOS []
    (Util/getOSType )))

(defn *run-task
  "task - `java.util.concurrent.FutureTask`
  logger - `org.apache.logging.log4j.Logger`

  returns: `<V> V`"
  ([^java.util.concurrent.FutureTask task ^org.apache.logging.log4j.Logger logger]
    (Util/runTask task logger)))

(defn *get-last-element
  "list - `java.util.List`

  returns: `<T> T`"
  ([^java.util.List list]
    (Util/getLastElement list)))

