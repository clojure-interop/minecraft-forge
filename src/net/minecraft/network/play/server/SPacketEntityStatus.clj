(ns net.minecraft.network.play.server.SPacketEntityStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityStatus]))

(defn ->s-packet-entity-status
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  opcode-in - `byte`"
  (^SPacketEntityStatus [^net.minecraft.entity.Entity entity-in ^Byte opcode-in]
    (new SPacketEntityStatus entity-in opcode-in))
  (^SPacketEntityStatus []
    (new SPacketEntityStatus )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityStatus this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityStatus this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityStatus this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity
  "world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^SPacketEntityStatus this ^net.minecraft.world.World world-in]
    (-> this (.getEntity world-in))))

(defn get-op-code
  "returns: `byte`"
  (^Byte [^SPacketEntityStatus this]
    (-> this (.getOpCode))))

