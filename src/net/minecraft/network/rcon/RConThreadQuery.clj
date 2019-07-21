(ns net.minecraft.network.rcon.RConThreadQuery
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon RConThreadQuery]))

(defn ->r-con-thread-query
  "Constructor.

  p-i-1536-1 - `net.minecraft.network.rcon.IServer`"
  (^RConThreadQuery [^net.minecraft.network.rcon.IServer p-i-1536-1]
    (new RConThreadQuery p-i-1536-1)))

(defn run
  ""
  ([^RConThreadQuery this]
    (-> this (.run))))

(defn start-thread
  ""
  ([^RConThreadQuery this]
    (-> this (.startThread))))

