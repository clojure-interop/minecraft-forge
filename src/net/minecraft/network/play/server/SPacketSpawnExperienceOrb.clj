(ns net.minecraft.network.play.server.SPacketSpawnExperienceOrb
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSpawnExperienceOrb]))

(defn ->s-packet-spawn-experience-orb
  "Constructor.

  orb - `net.minecraft.entity.item.EntityXPOrb`"
  (^SPacketSpawnExperienceOrb [^net.minecraft.entity.item.EntityXPOrb orb]
    (new SPacketSpawnExperienceOrb orb))
  (^SPacketSpawnExperienceOrb []
    (new SPacketSpawnExperienceOrb )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnExperienceOrb this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSpawnExperienceOrb this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSpawnExperienceOrb this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketSpawnExperienceOrb this]
    (-> this (.getEntityID))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketSpawnExperienceOrb this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketSpawnExperienceOrb this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketSpawnExperienceOrb this]
    (-> this (.getZ))))

(defn get-xp-value
  "returns: `int`"
  (^Integer [^SPacketSpawnExperienceOrb this]
    (-> this (.getXPValue))))

