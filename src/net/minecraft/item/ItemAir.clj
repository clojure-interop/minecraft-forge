(ns net.minecraft.item.ItemAir
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemAir]))

(defn ->item-air
  "Constructor.

  block-in - `net.minecraft.block.Block`"
  (^ItemAir [^net.minecraft.block.Block block-in]
    (new ItemAir block-in)))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemAir this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack)))
  (^java.lang.String [^ItemAir this]
    (-> this (.getUnlocalizedName))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemAir this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

