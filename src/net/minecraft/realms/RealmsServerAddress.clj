(ns net.minecraft.realms.RealmsServerAddress
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsServerAddress]))

(defn *parse-string
  "p-parse-string-0 - `java.lang.String`

  returns: `net.minecraft.realms.RealmsServerAddress`"
  (^net.minecraft.realms.RealmsServerAddress [^java.lang.String p-parse-string-0]
    (RealmsServerAddress/parseString p-parse-string-0)))

(defn get-host
  "returns: `java.lang.String`"
  (^java.lang.String [^RealmsServerAddress this]
    (-> this (.getHost))))

(defn get-port
  "returns: `int`"
  (^Integer [^RealmsServerAddress this]
    (-> this (.getPort))))

