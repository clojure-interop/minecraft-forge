(ns net.minecraftforge.event.AttachCapabilitiesEvent$Item
  "A version of the parent event which is only fired for ItemStacks."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event AttachCapabilitiesEvent$Item]))

(defn ->item
  "Constructor.

  item - `net.minecraft.item.Item`
  stack - `net.minecraft.item.ItemStack`"
  (^AttachCapabilitiesEvent$Item [^net.minecraft.item.Item item ^net.minecraft.item.ItemStack stack]
    (new AttachCapabilitiesEvent$Item item stack)))

(defn get-item
  "Deprecated.

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^AttachCapabilitiesEvent$Item this]
    (-> this (.getItem))))

(defn get-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AttachCapabilitiesEvent$Item this]
    (-> this (.getItemStack))))

