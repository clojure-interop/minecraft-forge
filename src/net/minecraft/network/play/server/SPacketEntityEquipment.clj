(ns net.minecraft.network.play.server.SPacketEntityEquipment
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.play.server SPacketEntityEquipment]))

(defn ->s-packet-entity-equipment
  "Constructor.

  entity-id-in - `int`
  equipment-slot-in - `net.minecraft.inventory.EntityEquipmentSlot`
  item-stack-in - `net.minecraft.item.ItemStack`"
  (^SPacketEntityEquipment [^Integer entity-id-in ^net.minecraft.inventory.EntityEquipmentSlot equipment-slot-in ^net.minecraft.item.ItemStack item-stack-in]
    (new SPacketEntityEquipment entity-id-in equipment-slot-in item-stack-in))
  (^SPacketEntityEquipment []
    (new SPacketEntityEquipment )))

(defn read-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityEquipment this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.readPacketData buf))))

(defn write-packet-data
  "buf - `net.minecraft.network.PacketBuffer`

  throws: java.io.IOException"
  ([^SPacketEntityEquipment this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.writePacketData buf))))

(defn process-packet
  "handler - `net.minecraft.network.play.INetHandlerPlayClient`"
  ([^SPacketEntityEquipment this ^net.minecraft.network.play.INetHandlerPlayClient handler]
    (-> this (.processPacket handler))))

(defn get-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SPacketEntityEquipment this]
    (-> this (.getItemStack))))

(defn get-entity-id
  "returns: `int`"
  (^Integer [^SPacketEntityEquipment this]
    (-> this (.getEntityID))))

(defn get-equipment-slot
  "returns: `net.minecraft.inventory.EntityEquipmentSlot`"
  (^net.minecraft.inventory.EntityEquipmentSlot [^SPacketEntityEquipment this]
    (-> this (.getEquipmentSlot))))

