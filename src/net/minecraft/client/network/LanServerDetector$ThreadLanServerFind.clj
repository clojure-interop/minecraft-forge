(ns net.minecraft.client.network.LanServerDetector$ThreadLanServerFind
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.network LanServerDetector$ThreadLanServerFind]))

(defn ->thread-lan-server-find
  "Constructor.

  list - `net.minecraft.client.network.LanServerDetector$LanServerList`

  throws: java.io.IOException"
  (^LanServerDetector$ThreadLanServerFind [^net.minecraft.client.network.LanServerDetector$LanServerList list]
    (new LanServerDetector$ThreadLanServerFind list)))

(defn run
  ""
  ([^LanServerDetector$ThreadLanServerFind this]
    (-> this (.run))))

