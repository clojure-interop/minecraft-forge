(ns net.minecraft.client.multiplayer.ThreadLanServerPing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.multiplayer ThreadLanServerPing]))

(defn ->thread-lan-server-ping
  "Constructor.

  p-i-1321-1 - `java.lang.String`
  p-i-1321-2 - `java.lang.String`

  throws: java.io.IOException"
  (^ThreadLanServerPing [^java.lang.String p-i-1321-1 ^java.lang.String p-i-1321-2]
    (new ThreadLanServerPing p-i-1321-1 p-i-1321-2)))

(defn *get-ping-response
  "p-77525-0 - `java.lang.String`
  p-77525-1 - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String p-77525-0 ^java.lang.String p-77525-1]
    (ThreadLanServerPing/getPingResponse p-77525-0 p-77525-1)))

(defn *get-motd-from-ping-response
  "p-77524-0 - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String p-77524-0]
    (ThreadLanServerPing/getMotdFromPingResponse p-77524-0)))

(defn *get-ad-from-ping-response
  "p-77523-0 - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String p-77523-0]
    (ThreadLanServerPing/getAdFromPingResponse p-77523-0)))

(defn run
  ""
  ([^ThreadLanServerPing this]
    (-> this (.run))))

(defn interrupt
  ""
  ([^ThreadLanServerPing this]
    (-> this (.interrupt))))

