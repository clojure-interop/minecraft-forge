(ns net.minecraft.item.ItemExpBottle
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemExpBottle]))

(defn ->item-exp-bottle
  "Constructor."
  (^ItemExpBottle []
    (new ItemExpBottle )))

(defn has-effect?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemExpBottle this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasEffect stack))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemExpBottle this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

