(ns net.minecraft.item.ItemSlab
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSlab]))

(defn ->item-slab
  "Constructor.

  block - `net.minecraft.block.Block`
  single-slab - `net.minecraft.block.BlockSlab`
  double-slab - `net.minecraft.block.BlockSlab`"
  (^ItemSlab [^net.minecraft.block.Block block ^net.minecraft.block.BlockSlab single-slab ^net.minecraft.block.BlockSlab double-slab]
    (new ItemSlab block single-slab double-slab)))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemSlab this ^Integer damage]
    (-> this (.getMetadata damage))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemSlab this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

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
  (^net.minecraft.util.EnumActionResult [^ItemSlab this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn can-place-block-on-side?
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`
  player - `net.minecraft.entity.player.EntityPlayer`
  stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemSlab this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack stack]
    (-> this (.canPlaceBlockOnSide world-in pos side player stack))))

