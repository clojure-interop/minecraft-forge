(ns net.minecraft.block.BlockGlowstone
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockGlowstone]))

(defn ->block-glowstone
  "Constructor.

  material-in - `net.minecraft.block.material.Material`"
  (^BlockGlowstone [^net.minecraft.block.material.Material material-in]
    (new BlockGlowstone material-in)))

(defn quantity-dropped-with-bonus
  "fortune - `int`
  random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockGlowstone this ^Integer fortune ^java.util.Random random]
    (-> this (.quantityDroppedWithBonus fortune random))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockGlowstone this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockGlowstone this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn get-map-color
  "state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^BlockGlowstone this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMapColor state))))

