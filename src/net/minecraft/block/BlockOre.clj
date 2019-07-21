(ns net.minecraft.block.BlockOre
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockOre]))

(defn ->block-ore
  "Constructor.

  color - `net.minecraft.block.material.MapColor`"
  (^BlockOre [^net.minecraft.block.material.MapColor color]
    (new BlockOre color))
  (^BlockOre []
    (new BlockOre )))

(defn get-item-dropped
  "state - `net.minecraft.block.state.IBlockState`
  rand - `java.util.Random`
  fortune - `int`

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^BlockOre this ^net.minecraft.block.state.IBlockState state ^java.util.Random rand ^Integer fortune]
    (-> this (.getItemDropped state rand fortune))))

(defn quantity-dropped
  "random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockOre this ^java.util.Random random]
    (-> this (.quantityDropped random))))

(defn quantity-dropped-with-bonus
  "fortune - `int`
  random - `java.util.Random`

  returns: `int`"
  (^Integer [^BlockOre this ^Integer fortune ^java.util.Random random]
    (-> this (.quantityDroppedWithBonus fortune random))))

(defn drop-block-as-item-with-chance
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  chance - `float`
  fortune - `int`"
  ([^BlockOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Float chance ^Integer fortune]
    (-> this (.dropBlockAsItemWithChance world-in pos state chance fortune))))

(defn get-exp-drop
  "Description copied from class: Block

  state - The current state - `net.minecraft.block.state.IBlockState`
  world - The world - `net.minecraft.world.IBlockAccess`
  pos - Block position - `net.minecraft.util.math.BlockPos`
  fortune - `int`

  returns: Amount of XP from breaking this block. - `int`"
  (^Integer [^BlockOre this ^net.minecraft.block.state.IBlockState state ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.getExpDrop state world pos fortune))))

(defn get-item
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockOre this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (-> this (.getItem world-in pos state))))

(defn damage-dropped
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockOre this ^net.minecraft.block.state.IBlockState state]
    (-> this (.damageDropped state))))

