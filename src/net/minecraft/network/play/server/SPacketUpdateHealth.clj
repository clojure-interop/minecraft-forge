(ns net.minecraft.network.play.server.SPacketUpdateHealth
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketUpdateHealth]))

(defn ->s-packet-update-health
  "Constructor.

  health-in - `float`
  food-level-in - `int`
  saturation-level-in - `float`"
  (^SPacketUpdateHealth [^Float health-in ^Integer food-level-in ^Float saturation-level-in]
    (new SPacketUpdateHealth health-in food-level-in saturation-level-in))
  (^SPacketUpdateHealth []
    (new SPacketUpdateHealth )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateHealth this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketUpdateHealth this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketUpdateHealth this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-health
  "returns: `float`"
  (^Float [^SPacketUpdateHealth this]
    (-> this (.getHealth))))

(defn get-food-level
  "returns: `int`"
  (^Integer [^SPacketUpdateHealth this]
    (-> this (.getFoodLevel))))

(defn get-saturation-level
  "returns: `float`"
  (^Float [^SPacketUpdateHealth this]
    (-> this (.getSaturationLevel))))

