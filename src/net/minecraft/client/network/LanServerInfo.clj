(ns net.minecraft.client.network.LanServerInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network LanServerInfo]))

(defn ->lan-server-info
  "Constructor.

  p-i-47130-1 - `java.lang.String`
  p-i-47130-2 - `java.lang.String`"
  (^LanServerInfo [^java.lang.String p-i-47130-1 ^java.lang.String p-i-47130-2]
    (new LanServerInfo p-i-47130-1 p-i-47130-2)))

(defn get-server-motd
  "returns: `java.lang.String`"
  (^java.lang.String [^LanServerInfo this]
    (-> this (.getServerMotd))))

(defn get-server-ip-port
  "returns: `java.lang.String`"
  (^java.lang.String [^LanServerInfo this]
    (-> this (.getServerIpPort))))

(defn update-last-seen
  ""
  ([^LanServerInfo this]
    (-> this (.updateLastSeen))))

