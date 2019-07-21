(ns net.minecraft.item.ItemSeedFood
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSeedFood]))

(defn ->item-seed-food
  "Constructor.

  heal-amount - `int`
  saturation - `float`
  crops - `net.minecraft.block.Block`
  soil - `net.minecraft.block.Block`"
  (^ItemSeedFood [^Integer heal-amount ^Float saturation ^net.minecraft.block.Block crops ^net.minecraft.block.Block soil]
    (new ItemSeedFood heal-amount saturation crops soil)))

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
  (^net.minecraft.util.EnumActionResult [^ItemSeedFood this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn get-plant-type
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraftforge.common.EnumPlantType`"
  (^net.minecraftforge.common.EnumPlantType [^ItemSeedFood this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPlantType world pos))))

(defn get-plant
  "world - `net.minecraft.world.IBlockAccess`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^ItemSeedFood this ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getPlant world pos))))

