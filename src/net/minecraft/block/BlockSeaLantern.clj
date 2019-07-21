(ns net.minecraft.block.BlockSeaLantern
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockSeaLantern]))

(defn ->block-sea-lantern
  "Constructor.

  material-in - `net.minecraft.block.material.Material`"
  (^BlockSeaLantern [^net.minecraft.block.material.Material material-in]
    (new BlockSeaLantern material-in)))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockSeaLantern this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn quantity-dropped-with-bonus
  "fortune - `int`
  random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockSeaLantern this ^Integer fortune ^java.util.Random random]
    (-> this (.quantityDroppedWithBonus fortune random))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockSeaLantern this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockSeaLantern this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

