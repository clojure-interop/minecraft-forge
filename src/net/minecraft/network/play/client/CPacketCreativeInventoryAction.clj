(ns net.minecraft.network.play.client.CPacketCreativeInventoryAction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.client CPacketCreativeInventoryAction]))

(defn ->c-packet-creative-inventory-action
  "Constructor.

  slot-id-in - `int`
  stack-in - `net.minecraft.item.ItemStack`"
  (^CPacketCreativeInventoryAction [^Integer slot-id-in ^net.minecraft.item.ItemStack stack-in]
    (new CPacketCreativeInventoryAction slot-id-in stack-in))
  (^CPacketCreativeInventoryAction []
    (new CPacketCreativeInventoryAction )))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayServer`"
  ([^CPacketCreativeInventoryAction this ^net.minecraft.network.play.INetHandlerPlayServer handler]
    (-> this (.processPacket handler))))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketCreativeInventoryAction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^CPacketCreativeInventoryAction this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn get-slot-id
  "returns: `int`"
  (^Integer [^CPacketCreativeInventoryAction this]
    (-> this (.getSlotId))))

(defn get-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^CPacketCreativeInventoryAction this]
    (-> this (.getStack))))

