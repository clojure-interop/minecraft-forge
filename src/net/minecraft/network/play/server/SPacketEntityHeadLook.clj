(ns net.minecraft.network.play.server.SPacketEntityHeadLook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityHeadLook]))

(defn ->s-packet-entity-head-look
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  yaw-in - `byte`"
  (^SPacketEntityHeadLook [^net.minecraft.entity.Entity entity-in ^Byte yaw-in]
    (new SPacketEntityHeadLook entity-in yaw-in))
  (^SPacketEntityHeadLook []
    (new SPacketEntityHeadLook )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityHeadLook this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityHeadLook this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityHeadLook this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity
  "world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^SPacketEntityHeadLook this ^net.minecraft.world.World world-in]
    (-> this (.getEntity world-in))))

(defn get-yaw
  "returns: `byte`"
  (^Byte [^SPacketEntityHeadLook this]
    (-> this (.getYaw))))

