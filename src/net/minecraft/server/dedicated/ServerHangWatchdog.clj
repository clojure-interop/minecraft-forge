(ns net.minecraft.server.dedicated.ServerHangWatchdog
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.dedicated ServerHangWatchdog]))

(defn ->server-hang-watchdog
  "Constructor.

  server - `net.minecraft.server.dedicated.DedicatedServer`"
  (^ServerHangWatchdog [^net.minecraft.server.dedicated.DedicatedServer server]
    (new ServerHangWatchdog server)))

(defn run
  ""
  ([^ServerHangWatchdog this]
    (-> this (.run))))

