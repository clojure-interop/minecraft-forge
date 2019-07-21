(ns net.minecraft.network.play.server.SPacketServerDifficulty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketServerDifficulty]))

(defn ->s-packet-server-difficulty
  "Constructor.

  difficulty-in - `net.minecraft.world.EnumDifficulty`
  difficulty-locked-in - `boolean`"
  (^SPacketServerDifficulty [^net.minecraft.world.EnumDifficulty difficulty-in ^Boolean difficulty-locked-in]
    (new SPacketServerDifficulty difficulty-in difficulty-locked-in))
  (^SPacketServerDifficulty []
    (new SPacketServerDifficulty )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketServerDifficulty this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketServerDifficulty this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketServerDifficulty this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn difficulty-locked?
  "returns: `boolean`"
  (^Boolean [^SPacketServerDifficulty this]
    (-> this (.isDifficultyLocked))))

(defn get-difficulty
  "returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^SPacketServerDifficulty this]
    (-> this (.getDifficulty))))

