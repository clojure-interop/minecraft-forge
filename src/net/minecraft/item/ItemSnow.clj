(ns net.minecraft.item.ItemSnow
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSnow]))

(defn ->item-snow
  "Constructor.

  block - `net.minecraft.block.Block`"
  (^ItemSnow [^net.minecraft.block.Block block]
    (new ItemSnow block)))

(defn on-item-use
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ItemSnow this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemSnow this ^Integer damage]
    (-> this (.getMetadata damage))))

(defn can-place-block-on-side?
  "world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`
  player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemSnow this ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (-> this (.canPlaceBlockOnSide world pos side player stack))))

