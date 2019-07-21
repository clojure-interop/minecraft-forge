(ns net.minecraft.network.play.server.SPacketCustomSound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketCustomSound]))

(defn ->s-packet-custom-sound
  "Constructor.

  sound-name-in - `java.lang.String`
  category-in - `net.minecraft.util.SoundCategory`
  x-in - `double`
  y-in - `double`
  z-in - `double`
  volume-in - `float`
  pitch-in - `float`"
  (^SPacketCustomSound [^java.lang.String sound-name-in ^net.minecraft.util.SoundCategory category-in ^Double x-in ^Double y-in ^Double z-in ^Float volume-in ^Float pitch-in]
    (new SPacketCustomSound sound-name-in category-in x-in y-in z-in volume-in pitch-in))
  (^SPacketCustomSound []
    (new SPacketCustomSound )))

(defn get-volume
  "returns: `float`"
  (^Float [^SPacketCustomSound this]
    (-> this (.getVolume))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCustomSound this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn get-sound-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SPacketCustomSound this]
    (-> this (.getSoundName))))

(defn get-pitch
  "returns: `float`"
  (^Float [^SPacketCustomSound this]
    (-> this (.getPitch))))

(defn get-z
  "returns: `double`"
  (^Double [^SPacketCustomSound this]
    (-> this (.getZ))))

(defn get-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^SPacketCustomSound this]
    (-> this (.getCategory))))

(defn get-y
  "returns: `double`"
  (^Double [^SPacketCustomSound this]
    (-> this (.getY))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketCustomSound this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-x
  "returns: `double`"
  (^Double [^SPacketCustomSound this]
    (-> this (.getX))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketCustomSound this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

