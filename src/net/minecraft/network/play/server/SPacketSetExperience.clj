(ns net.minecraft.network.play.server.SPacketSetExperience
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSetExperience]))

(defn ->s-packet-set-experience
  "Constructor.

  experience-bar-in - `float`
  total-experience-in - `int`
  level-in - `int`"
  (^SPacketSetExperience [^Float experience-bar-in ^Integer total-experience-in ^Integer level-in]
    (new SPacketSetExperience experience-bar-in total-experience-in level-in))
  (^SPacketSetExperience []
    (new SPacketSetExperience )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSetExperience this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSetExperience this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSetExperience this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-experience-bar
  "returns: `float`"
  (^Float [^SPacketSetExperience this]
    (-> this (.getExperienceBar))))

(defn get-total-experience
  "returns: `int`"
  (^Integer [^SPacketSetExperience this]
    (-> this (.getTotalExperience))))

(defn get-level
  "returns: `int`"
  (^Integer [^SPacketSetExperience this]
    (-> this (.getLevel))))

