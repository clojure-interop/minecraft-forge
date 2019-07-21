(ns net.minecraft.item.ItemSpade
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemSpade]))

(defn ->item-spade
  "Constructor.

  material - `net.minecraft.item.Item$ToolMaterial`"
  (^ItemSpade [^net.minecraft.item.Item$ToolMaterial material]
    (new ItemSpade material)))

(defn can-harvest-block?
  "block-in - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^ItemSpade this ^net.minecraft.block.state.IBlockState block-in]
    (-> this (.canHarvestBlock block-in))))

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
  (^net.minecraft.util.EnumActionResult [^ItemSpade this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

