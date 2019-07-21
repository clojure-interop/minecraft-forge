(ns net.minecraft.network.play.server.SPacketCamera
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCamera]))

(defn ->s-packet-camera
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`"
  (^SPacketCamera [^net.minecraft.entity.Entity entity-in]
    (new SPacketCamera entity-in))
  (^SPacketCamera []
    (new SPacketCamera )))

(defn entity-id
  "Instance Field.

  type: int"
  (^Integer [^SPacketCamera this]
    (-> this .-entityId)))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCamera this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCamera this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketCamera this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity
  "world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^SPacketCamera this ^net.minecraft.world.World world-in]
    (-> this (.getEntity world-in))))

