(ns net.minecraft.item.ItemMultiTexture
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemMultiTexture]))

(defn ->item-multi-texture
  "Constructor.

  p-i-47262-1 - `net.minecraft.block.Block`
  p-i-47262-2 - `net.minecraft.block.Block`
  p-i-47262-3 - `net.minecraft.item.ItemMultiTexture$Mapper`"
  (^ItemMultiTexture [^net.minecraft.block.Block p-i-47262-1 ^net.minecraft.block.Block p-i-47262-2 ^net.minecraft.item.ItemMultiTexture$Mapper p-i-47262-3]
    (new ItemMultiTexture p-i-47262-1 p-i-47262-2 p-i-47262-3)))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemMultiTexture this ^Integer damage]
    (-> this (.getMetadata damage))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemMultiTexture this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

