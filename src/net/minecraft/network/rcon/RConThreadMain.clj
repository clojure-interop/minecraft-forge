(ns net.minecraft.network.rcon.RConThreadMain
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon RConThreadMain]))

(defn ->r-con-thread-main
  "Constructor.

  p-i-1538-1 - `net.minecraft.network.rcon.IServer`"
  (^RConThreadMain [^net.minecraft.network.rcon.IServer p-i-1538-1]
    (new RConThreadMain p-i-1538-1)))

(defn run
  ""
  ([^RConThreadMain this]
    (-> this (.run))))

(defn start-thread
  ""
  ([^RConThreadMain this]
    (-> this (.startThread))))

