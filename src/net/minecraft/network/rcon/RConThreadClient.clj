(ns net.minecraft.network.rcon.RConThreadClient
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.rcon RConThreadClient]))

(defn run
  ""
  ([^RConThreadClient this]
    (-> this (.run))))

