(ns net.minecraft.client.multiplayer.ServerAddress
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer ServerAddress]))

(defn *from-string
  "addr-string - `java.lang.String`

  returns: `net.minecraft.client.multiplayer.ServerAddress`"
  (^net.minecraft.client.multiplayer.ServerAddress [^java.lang.String addr-string]
    (ServerAddress/fromString addr-string)))

(defn get-ip
  "returns: `java.lang.String`"
  (^java.lang.String [^ServerAddress this]
    (-> this (.getIP))))

(defn get-port
  "returns: `int`"
  (^Integer [^ServerAddress this]
    (-> this (.getPort))))

