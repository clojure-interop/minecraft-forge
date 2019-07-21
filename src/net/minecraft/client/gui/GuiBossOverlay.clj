(ns net.minecraft.client.gui.GuiBossOverlay
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiBossOverlay]))

(defn ->gui-boss-overlay
  "Constructor.

  client-in - `net.minecraft.client.Minecraft`"
  (^GuiBossOverlay [^net.minecraft.client.Minecraft client-in]
    (new GuiBossOverlay client-in)))

(defn render-boss-health
  ""
  ([^GuiBossOverlay this]
    (-> this (.renderBossHealth))))

(defn read
  "packet-in - `net.minecraft.network.play.server.SPacketUpdateBossInfo`"
  ([^GuiBossOverlay this ^net.minecraft.network.play.server.SPacketUpdateBossInfo packet-in]
    (-> this (.read packet-in))))

(defn clear-boss-infos
  ""
  ([^GuiBossOverlay this]
    (-> this (.clearBossInfos))))

(defn should-play-end-boss-music?
  "returns: `boolean`"
  (^Boolean [^GuiBossOverlay this]
    (-> this (.shouldPlayEndBossMusic))))

(defn should-darken-sky?
  "returns: `boolean`"
  (^Boolean [^GuiBossOverlay this]
    (-> this (.shouldDarkenSky))))

(defn should-create-fog?
  "returns: `boolean`"
  (^Boolean [^GuiBossOverlay this]
    (-> this (.shouldCreateFog))))

