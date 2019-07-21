(ns net.minecraft.item.ItemWritableBook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemWritableBook]))

(defn ->item-writable-book
  "Constructor."
  (^ItemWritableBook []
    (new ItemWritableBook )))

(defn *nbt-valid?
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `boolean`"
  (^Boolean [^net.minecraft.nbt.NBTTagCompound nbt]
    (ItemWritableBook/isNBTValid nbt)))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemWritableBook this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

