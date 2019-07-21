(ns net.minecraft.world.BossInfoLerping
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world BossInfoLerping]))

(defn ->boss-info-lerping
  "Constructor.

  packet-in - `net.minecraft.network.play.server.SPacketUpdateBossInfo`"
  (^BossInfoLerping [^net.minecraft.network.play.server.SPacketUpdateBossInfo packet-in]
    (new BossInfoLerping packet-in)))

(defn set-percent
  "percent-in - `float`"
  ([^BossInfoLerping this ^Float percent-in]
    (-> this (.setPercent percent-in))))

(defn get-percent
  "returns: `float`"
  (^Float [^BossInfoLerping this]
    (-> this (.getPercent))))

(defn update-from-packet
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateBossInfo`"
  ([^BossInfoLerping this ^net.minecraft.network.play.server.SPacketUpdateBossInfo packet-in]
    (-> this (.updateFromPacket packet-in))))

