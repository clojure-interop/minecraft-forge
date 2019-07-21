(ns net.minecraft.item.ItemElytra
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemElytra]))

(defn ->item-elytra
  "Constructor."
  (^ItemElytra []
    (new ItemElytra )))

(defn *broken?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack]
    (ItemElytra/isBroken stack)))

(defn get-is-repairable?
  "to-repair - `net.minecraft.item.ItemStack`
  repair - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemElytra this ^net.minecraft.item.ItemStack to-repair ^net.minecraft.item.ItemStack repair]
    (-> this (.getIsRepairable to-repair repair))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemElytra this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

