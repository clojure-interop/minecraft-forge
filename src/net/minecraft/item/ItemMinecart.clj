(ns net.minecraft.item.ItemMinecart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemMinecart]))

(defn ->item-minecart
  "Constructor.

  type-in - `net.minecraft.entity.item.EntityMinecart$Type`"
  (^ItemMinecart [^net.minecraft.entity.item.EntityMinecart$Type type-in]
    (new ItemMinecart type-in)))

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
  (^net.minecraft.util.EnumActionResult [^ItemMinecart this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

