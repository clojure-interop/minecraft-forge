(ns net.minecraft.network.play.server.SPacketSetSlot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketSetSlot]))

(defn ->s-packet-set-slot
  "Constructor.

  window-id-in - `int`
  slot-in - `int`
  item-in - `net.minecraft.item.ItemStack`"
  (^SPacketSetSlot [^Integer window-id-in ^Integer slot-in ^net.minecraft.item.ItemStack item-in]
    (new SPacketSetSlot window-id-in slot-in item-in))
  (^SPacketSetSlot []
    (new SPacketSetSlot )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketSetSlot this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSetSlot this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketSetSlot this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^SPacketSetSlot this]
    (-> this (.getWindowId))))

(defn get-slot
  "returns: `int`"
  (^Integer [^SPacketSetSlot this]
    (-> this (.getSlot))))

(defn get-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SPacketSetSlot this]
    (-> this (.getStack))))

