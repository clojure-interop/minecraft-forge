(ns net.minecraft.network.play.server.SPacketSoundEffect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSoundEffect]))

(defn ->s-packet-sound-effect
  "Constructor.

  sound-in - `net.minecraft.util.SoundEvent`
  category-in - `net.minecraft.util.SoundCategory`
  x-in - `double`
  y-in - `double`
  z-in - `double`
  volume-in - `float`
  pitch-in - `float`"
  (^SPacketSoundEffect [^net.minecraft.util.SoundEvent sound-in ^net.minecraft.util.SoundCategory category-in ^Double x-in ^Double y-in ^Double z-in ^Float volume-in ^Float pitch-in]
    (new SPacketSoundEffect sound-in category-in x-in y-in z-in volume-in pitch-in))
  (^SPacketSoundEffect []
    (new SPacketSoundEffect )))

(defn get-volume
  "returns: `float`"
  (^Float [^SPacketSoundEffect this]
    (-> this (.getVolume))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSoundEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-pitch
  "returns: `float`"
  (^Float [^SPacketSoundEffect this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketSoundEffect this]
    (-> this (.getZ))))

(defn get-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^SPacketSoundEffect this]
    (-> this (.getCategory))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketSoundEffect this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSoundEffect this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketSoundEffect this]
    (-> this (.getX))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSoundEffect this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^SPacketSoundEffect this]
    (-> this (.getSound))))

