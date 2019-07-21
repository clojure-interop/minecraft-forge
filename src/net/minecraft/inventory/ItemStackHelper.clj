(ns net.minecraft.inventory.ItemStackHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ItemStackHelper]))

(defn ->item-stack-helper
  "Constructor."
  (^ItemStackHelper []
    (new ItemStackHelper )))

(defn *get-and-split
  "stacks - `java.util.List`
  index - `int`
  amount - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^java.util.List stacks ^Integer index ^Integer amount]
    (ItemStackHelper/getAndSplit stacks index amount)))

(defn *get-and-remove
  "stacks - `java.util.List`
  index - `int`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^java.util.List stacks ^Integer index]
    (ItemStackHelper/getAndRemove stacks index)))

(defn *save-all-items
  "tag - `net.minecraft.nbt.NBTTagCompound`
  list - `net.minecraft.util.NonNullList`
  p-191281-2 - `boolean`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.nbt.NBTTagCompound tag ^net.minecraft.util.NonNullList list ^Boolean p-191281-2]
    (ItemStackHelper/saveAllItems tag list p-191281-2))
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.nbt.NBTTagCompound tag ^net.minecraft.util.NonNullList list]
    (ItemStackHelper/saveAllItems tag list)))

(defn *load-all-items
  "tag - `net.minecraft.nbt.NBTTagCompound`
  list - `net.minecraft.util.NonNullList`"
  ([^net.minecraft.nbt.NBTTagCompound tag ^net.minecraft.util.NonNullList list]
    (ItemStackHelper/loadAllItems tag list)))

