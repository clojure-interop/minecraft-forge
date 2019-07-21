(ns net.minecraft.network.play.server.SPacketMaps
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketMaps]))

(defn ->s-packet-maps
  "Constructor.

  map-id-in - `int`
  map-scale-in - `byte`
  tracking-position-in - `boolean`
  icons-in - `java.util.Collection`
  p-i-46937-5 - `byte[]`
  min-x-in - `int`
  min-z-in - `int`
  columns-in - `int`
  rows-in - `int`"
  (^SPacketMaps [^Integer map-id-in ^Byte map-scale-in ^Boolean tracking-position-in ^java.util.Collection icons-in p-i-46937-5 ^Integer min-x-in ^Integer min-z-in ^Integer columns-in ^Integer rows-in]
    (new SPacketMaps map-id-in map-scale-in tracking-position-in icons-in p-i-46937-5 min-x-in min-z-in columns-in rows-in))
  (^SPacketMaps []
    (new SPacketMaps )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketMaps this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketMaps this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketMaps this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-map-id
  "returns: `int`"
  (^Integer [^SPacketMaps this]
    (-> this (.getMapId))))

(defn set-mapdata-to
  "mapdata-in - `net.minecraft.world.storage.MapData`"
  ([^SPacketMaps this ^net.minecraft.world.storage.MapData mapdata-in]
    (-> this (.setMapdataTo mapdata-in))))

