(ns net.minecraft.network.play.server.SPacketEntityEffect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityEffect]))

(defn ->s-packet-entity-effect
  "Constructor.

  entity-id-in - `int`
  effect - `net.minecraft.potion.PotionEffect`"
  (^SPacketEntityEffect [^Integer entity-id-in ^net.minecraft.potion.PotionEffect effect]
    (new SPacketEntityEffect entity-id-in effect))
  (^SPacketEntityEffect []
    (new SPacketEntityEffect )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-is-ambient?
  "returns: `boolean`"
  (^Boolean [^SPacketEntityEffect this]
    (-> this (.getIsAmbient))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityEffect this]
    (-> this (.getEntityId))))

(defn max-duration?
  "returns: `boolean`"
  (^Boolean [^SPacketEntityEffect this]
    (-> this (.isMaxDuration))))

(defn get-amplifier
  "returns: `byte`"
  (^Byte [^SPacketEntityEffect this]
    (-> this (.getAmplifier))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityEffect this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-effect-id
  "returns: `byte`"
  (^Byte [^SPacketEntityEffect this]
    (-> this (.getEffectId))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn does-show-particles
  "returns: `boolean`"
  (^Boolean [^SPacketEntityEffect this]
    (-> this (.doesShowParticles))))

(defn get-duration
  "returns: `int`"
  (^Integer [^SPacketEntityEffect this]
    (-> this (.getDuration))))

