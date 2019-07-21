(ns net.minecraft.network.rcon.RConThreadBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon RConThreadBase]))

(defn start-thread
  ""
  ([^RConThreadBase this]
    (-> this (.startThread))))

(defn running?
  "returns: `boolean`"
  (^Boolean [^RConThreadBase this]
    (-> this (.isRunning))))

