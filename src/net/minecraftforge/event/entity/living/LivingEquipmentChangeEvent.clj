(ns net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent
  "LivingEquipmentChangeEvent is fired when the Equipment of a Entity changes.
  This event is fired whenever changes in Equipment are detected in EntityLivingBase.onUpdate().
  This also includes entities joining the World, as well as being cloned.
  This event is fired on server-side only.

  slot contains the affected EntityEquipmentSlot.
  from contains the ItemStack that was equipped previously.
  to contains the ItemStack that is equipped now.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEquipmentChangeEvent]))

(defn ->living-equipment-change-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  slot - `net.minecraft.inventory.EntityEquipmentSlot`
  from - `net.minecraft.item.ItemStack`
  to - `net.minecraft.item.ItemStack`"
  (^LivingEquipmentChangeEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.inventory.EntityEquipmentSlot slot ^net.minecraft.item.ItemStack from ^net.minecraft.item.ItemStack to]
    (new LivingEquipmentChangeEvent entity slot from to)))

(defn get-slot
  "returns: `net.minecraft.inventory.EntityEquipmentSlot`"
  (^net.minecraft.inventory.EntityEquipmentSlot [^LivingEquipmentChangeEvent this]
    (-> this (.getSlot))))

(defn get-from
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^LivingEquipmentChangeEvent this]
    (-> this (.getFrom))))

(defn get-to
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^LivingEquipmentChangeEvent this]
    (-> this (.getTo))))

