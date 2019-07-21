(ns net.minecraft.network.play.server.SPacketUpdateBossInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUpdateBossInfo]))

(defn ->s-packet-update-boss-info
  "Constructor.

  operation-in - `net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation`
  data - `net.minecraft.world.BossInfo`"
  (^SPacketUpdateBossInfo [^net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation operation-in ^net.minecraft.world.BossInfo data]
    (new SPacketUpdateBossInfo operation-in data))
  (^SPacketUpdateBossInfo []
    (new SPacketUpdateBossInfo )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateBossInfo this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-overlay
  "returns: `net.minecraft.world.BossInfo$Overlay`"
  (^net.minecraft.world.BossInfo$Overlay [^SPacketUpdateBossInfo this]
    (-> this (.getOverlay))))

(defn should-play-end-boss-music?
  "returns: `boolean`"
  (^Boolean [^SPacketUpdateBossInfo this]
    (-> this (.shouldPlayEndBossMusic))))

(defn get-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^SPacketUpdateBossInfo this]
    (-> this (.getName))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketUpdateBossInfo this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-percent
  "returns: `float`"
  (^Float [^SPacketUpdateBossInfo this]
    (-> this (.getPercent))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateBossInfo this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn should-create-fog?
  "returns: `boolean`"
  (^Boolean [^SPacketUpdateBossInfo this]
    (-> this (.shouldCreateFog))))

(defn get-unique-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^SPacketUpdateBossInfo this]
    (-> this (.getUniqueId))))

(defn get-operation
  "returns: `net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation`"
  (^net.minecraft.network.play.server.SPacketUpdateBossInfo$Operation [^SPacketUpdateBossInfo this]
    (-> this (.getOperation))))

(defn get-color
  "returns: `net.minecraft.world.BossInfo$Color`"
  (^net.minecraft.world.BossInfo$Color [^SPacketUpdateBossInfo this]
    (-> this (.getColor))))

(defn should-darken-sky?
  "returns: `boolean`"
  (^Boolean [^SPacketUpdateBossInfo this]
    (-> this (.shouldDarkenSky))))

