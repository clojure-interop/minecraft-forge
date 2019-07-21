(ns net.minecraft.client.network.ServerPinger
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network ServerPinger]))

(defn ->server-pinger
  "Constructor."
  (^ServerPinger []
    (new ServerPinger )))

(defn ping
  "server - `net.minecraft.client.multiplayer.ServerData`

  throws: java.net.UnknownHostException"
  ([^ServerPinger this ^net.minecraft.client.multiplayer.ServerData server]
    (-> this (.ping server))))

(defn ping-pending-networks
  ""
  ([^ServerPinger this]
    (-> this (.pingPendingNetworks))))

(defn clear-pending-networks
  ""
  ([^ServerPinger this]
    (-> this (.clearPendingNetworks))))

