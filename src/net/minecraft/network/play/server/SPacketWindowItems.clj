(ns net.minecraft.network.play.server.SPacketWindowItems
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketWindowItems]))

(defn ->s-packet-window-items
  "Constructor.

  p-i-47317-1 - `int`
  p-i-47317-2 - `net.minecraft.util.NonNullList`"
  (^SPacketWindowItems [^Integer p-i-47317-1 ^net.minecraft.util.NonNullList p-i-47317-2]
    (new SPacketWindowItems p-i-47317-1 p-i-47317-2))
  (^SPacketWindowItems []
    (new SPacketWindowItems )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketWindowItems this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketWindowItems this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketWindowItems this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-window-id
  "returns: `int`"
  (^Integer [^SPacketWindowItems this]
    (-> this (.getWindowId))))

(defn get-item-stacks
  "returns: `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^SPacketWindowItems this]
    (-> this (.getItemStacks))))

