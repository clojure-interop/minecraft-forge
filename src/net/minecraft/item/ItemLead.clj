(ns net.minecraft.item.ItemLead
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemLead]))

(defn ->item-lead
  "Constructor."
  (^ItemLead []
    (new ItemLead )))

(defn *attach-to-fence
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  fence - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos fence]
    (ItemLead/attachToFence player world-in fence)))

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
  (^net.minecraft.util.EnumActionResult [^ItemLead this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

