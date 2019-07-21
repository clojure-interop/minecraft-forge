(ns net.minecraft.client.network.LanServerDetector$LanServerList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network LanServerDetector$LanServerList]))

(defn ->lan-server-list
  "Constructor."
  (^LanServerDetector$LanServerList []
    (new LanServerDetector$LanServerList )))

(defn get-was-updated?
  "returns: `boolean`"
  (^Boolean [^LanServerDetector$LanServerList this]
    (-> this (.getWasUpdated))))

(defn set-was-not-updated
  ""
  ([^LanServerDetector$LanServerList this]
    (-> this (.setWasNotUpdated))))

(defn get-lan-servers
  "returns: `java.util.List<net.minecraft.client.network.LanServerInfo>`"
  (^java.util.List [^LanServerDetector$LanServerList this]
    (-> this (.getLanServers))))

(defn add-server
  "ping-response - `java.lang.String`
  ip-address - `java.net.InetAddress`"
  ([^LanServerDetector$LanServerList this ^java.lang.String ping-response ^java.net.InetAddress ip-address]
    (-> this (.addServer ping-response ip-address))))

