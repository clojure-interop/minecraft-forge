(ns net.minecraft.item.ItemDoor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemDoor]))

(defn ->item-door
  "Constructor.

  block - `net.minecraft.block.Block`"
  (^ItemDoor [^net.minecraft.block.Block block]
    (new ItemDoor block)))

(defn *place-door
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`
  door - `net.minecraft.block.Block`
  is-right-hinge - `boolean`"
  ([^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^net.minecraft.block.Block door ^Boolean is-right-hinge]
    (ItemDoor/placeDoor world-in pos facing door is-right-hinge)))

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
  (^net.minecraft.util.EnumActionResult [^ItemDoor this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

