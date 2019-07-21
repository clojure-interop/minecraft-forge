(ns net.minecraft.network.play.client.CPacketEntityAction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketEntityAction]))

(defn ->c-packet-entity-action
  "Constructor.

  entity-in - `net.minecraft.entity.Entity`
  action-in - `net.minecraft.network.play.client.CPacketEntityAction$Action`
  aux-data-in - `int`"
  (^CPacketEntityAction [^net.minecraft.entity.Entity entity-in ^net.minecraft.network.play.client.CPacketEntityAction$Action action-in ^Integer aux-data-in]
    (new CPacketEntityAction entity-in action-in aux-data-in))
  (^CPacketEntityAction [^net.minecraft.entity.Entity entity-in ^net.minecraft.network.play.client.CPacketEntityAction$Action action-in]
    (new CPacketEntityAction entity-in action-in))
  (^CPacketEntityAction []
    (new CPacketEntityAction )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketEntityAction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketEntityAction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketEntityAction this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn get-action
  "returns: `net.minecraft.network.play.client.CPacketEntityAction$Action`"
  (^net.minecraft.network.play.client.CPacketEntityAction$Action [^CPacketEntityAction this]
    (-> this (.getAction))))

(defn get-aux-data
  "returns: `int`"
  (^Integer [^CPacketEntityAction this]
    (-> this (.getAuxData))))

