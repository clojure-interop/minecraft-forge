(ns net.minecraft.network.ServerStatusResponse$Version
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network ServerStatusResponse$Version]))

(defn ->version
  "Constructor.

  name-in - `java.lang.String`
  protocol-in - `int`"
  (^ServerStatusResponse$Version [^java.lang.String name-in ^Integer protocol-in]
    (new ServerStatusResponse$Version name-in protocol-in)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ServerStatusResponse$Version this]
    (-> this (.getName))))

(defn get-protocol
  "returns: `int`"
  (^Integer [^ServerStatusResponse$Version this]
    (-> this (.getProtocol))))

