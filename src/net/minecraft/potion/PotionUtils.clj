(ns net.minecraft.potion.PotionUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionUtils]))

(defn ->potion-utils
  "Constructor."
  (^PotionUtils []
    (new PotionUtils )))

(defn *get-potion-color-from-effect-list
  "effects - `java.util.Collection`

  returns: `int`"
  (^Integer [^java.util.Collection effects]
    (PotionUtils/getPotionColorFromEffectList effects)))

(defn *get-full-effects-from-item
  "item-in - `net.minecraft.item.ItemStack`

  returns: `java.util.List<net.minecraft.potion.PotionEffect>`"
  (^java.util.List [^net.minecraft.item.ItemStack item-in]
    (PotionUtils/getFullEffectsFromItem item-in)))

(defn *add-potion-tooltip
  "item-in - `net.minecraft.item.ItemStack`
  lores - `java.util.List`
  duration-factor - `float`"
  ([^net.minecraft.item.ItemStack item-in ^java.util.List lores ^Float duration-factor]
    (PotionUtils/addPotionTooltip item-in lores duration-factor)))

(defn *get-full-effects-from-tag
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `java.util.List<net.minecraft.potion.PotionEffect>`"
  (^java.util.List [^net.minecraft.nbt.NBTTagCompound tag]
    (PotionUtils/getFullEffectsFromTag tag)))

(defn *add-custom-potion-effect-to-list
  "tag - `net.minecraft.nbt.NBTTagCompound`
  effect-list - `java.util.List`"
  ([^net.minecraft.nbt.NBTTagCompound tag ^java.util.List effect-list]
    (PotionUtils/addCustomPotionEffectToList tag effect-list)))

(defn *get-effects-from-stack
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.util.List<net.minecraft.potion.PotionEffect>`"
  (^java.util.List [^net.minecraft.item.ItemStack stack]
    (PotionUtils/getEffectsFromStack stack)))

(defn *get-potion-from-item
  "item-in - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.potion.PotionType`"
  (^net.minecraft.potion.PotionType [^net.minecraft.item.ItemStack item-in]
    (PotionUtils/getPotionFromItem item-in)))

(defn *get-potion-color
  "potion-in - `net.minecraft.potion.PotionType`

  returns: `int`"
  (^Integer [^net.minecraft.potion.PotionType potion-in]
    (PotionUtils/getPotionColor potion-in)))

(defn *get-effects-from-tag
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `java.util.List<net.minecraft.potion.PotionEffect>`"
  (^java.util.List [^net.minecraft.nbt.NBTTagCompound tag]
    (PotionUtils/getEffectsFromTag tag)))

(defn *get-potion-type-from-nbt
  "tag - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.potion.PotionType`"
  (^net.minecraft.potion.PotionType [^net.minecraft.nbt.NBTTagCompound tag]
    (PotionUtils/getPotionTypeFromNBT tag)))

(defn *append-effects
  "item-in - `net.minecraft.item.ItemStack`
  effects - `java.util.Collection`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.item.ItemStack item-in ^java.util.Collection effects]
    (PotionUtils/appendEffects item-in effects)))

(defn *get-color
  "p-190932-0 - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack p-190932-0]
    (PotionUtils/getColor p-190932-0)))

(defn *add-potion-to-item-stack
  "item-in - `net.minecraft.item.ItemStack`
  potion-in - `net.minecraft.potion.PotionType`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.item.ItemStack item-in ^net.minecraft.potion.PotionType potion-in]
    (PotionUtils/addPotionToItemStack item-in potion-in)))

(defn *merge-effects
  "potion-in - `net.minecraft.potion.PotionType`
  effects - `java.util.Collection`

  returns: `java.util.List<net.minecraft.potion.PotionEffect>`"
  (^java.util.List [^net.minecraft.potion.PotionType potion-in ^java.util.Collection effects]
    (PotionUtils/mergeEffects potion-in effects)))

