(ns net.minecraft.network.play.client.CPacketPlayer$Position
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketPlayer$Position]))

(defn ->position
  "Constructor.

  x-in - `double`
  y-in - `double`
  z-in - `double`
  on-ground-in - `boolean`"
  (^CPacketPlayer$Position [^Double x-in ^Double y-in ^Double z-in ^Boolean on-ground-in]
    (new CPacketPlayer$Position x-in y-in z-in on-ground-in))
  (^CPacketPlayer$Position []
    (new CPacketPlayer$Position )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer$Position this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketPlayer$Position this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

