(ns net.minecraftforge.fml.common.StartupQuery
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common StartupQuery]))

(defn *confirm
  "text - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String text]
    (StartupQuery/confirm text)))

(defn *notify
  "text - `java.lang.String`"
  ([^java.lang.String text]
    (StartupQuery/notify text)))

(defn *abort
  ""
  ([]
    (StartupQuery/abort )))

(defn *reset
  ""
  ([]
    (StartupQuery/reset )))

(defn *check
  "returns: `boolean`"
  (^Boolean []
    (StartupQuery/check )))

(defn get-result?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^StartupQuery this]
    (-> this (.getResult))))

(defn set-result
  "result - `boolean`"
  ([^StartupQuery this ^Boolean result]
    (-> this (.setResult result))))

(defn get-text
  "returns: `java.lang.String`"
  (^java.lang.String [^StartupQuery this]
    (-> this (.getText))))

(defn synchronous?
  "returns: `boolean`"
  (^Boolean [^StartupQuery this]
    (-> this (.isSynchronous))))

(defn finish
  ""
  ([^StartupQuery this]
    (-> this (.finish))))

