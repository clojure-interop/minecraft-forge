(ns net.minecraft.network.play.server.SPacketWorldBorder
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketWorldBorder]))

(defn ->s-packet-world-border
  "Constructor.

  border - `net.minecraft.world.border.WorldBorder`
  action-in - `net.minecraft.network.play.server.SPacketWorldBorder$Action`"
  (^SPacketWorldBorder [^net.minecraft.world.border.WorldBorder border ^net.minecraft.network.play.server.SPacketWorldBorder$Action action-in]
    (new SPacketWorldBorder border action-in))
  (^SPacketWorldBorder []
    (new SPacketWorldBorder )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketWorldBorder this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketWorldBorder this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketWorldBorder this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn apply
  "border - `net.minecraft.world.border.WorldBorder`"
  ([^SPacketWorldBorder this ^net.minecraft.world.border.WorldBorder border]
    (-> this (.apply border))))

