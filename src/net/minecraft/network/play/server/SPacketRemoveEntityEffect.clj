(ns net.minecraft.network.play.server.SPacketRemoveEntityEffect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketRemoveEntityEffect]))

(defn ->s-packet-remove-entity-effect
  "Constructor.

  entity-id-in - `int`
  potion-in - `net.minecraft.potion.Potion`"
  (^SPacketRemoveEntityEffect [^Integer entity-id-in ^net.minecraft.potion.Potion potion-in]
    (new SPacketRemoveEntityEffect entity-id-in potion-in))
  (^SPacketRemoveEntityEffect []
    (new SPacketRemoveEntityEffect )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketRemoveEntityEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketRemoveEntityEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketRemoveEntityEffect this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity
  "world-in - `net.minecraft.world.World`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^SPacketRemoveEntityEffect this ^net.minecraft.world.World world-in]
    (-> this (.getEntity world-in))))

(defn get-potion
  "returns: `net.minecraft.potion.Potion`"
  (^net.minecraft.potion.Potion [^SPacketRemoveEntityEffect this]
    (-> this (.getPotion))))

