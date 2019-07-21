(ns net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Finish
  "Fired after an item has fully finished being used.
  The item has been notified that it was used, and the item/result stacks reflect after that state.
  This means that when this is fired for a Potion, the potion effect has already been applied.

  If you wish to cancel those effects, you should cancel one of the above events.

  The result item stack is the stack that is placed in the player's inventory in replacement of the stack that is currently being used."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEntityUseItemEvent$Finish]))

(defn ->finish
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`
  result - `net.minecraft.item.ItemStack`"
  (^LivingEntityUseItemEvent$Finish [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration ^net.minecraft.item.ItemStack result]
    (new LivingEntityUseItemEvent$Finish entity item duration result)))

(defn get-result-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^LivingEntityUseItemEvent$Finish this]
    (-> this (.getResultStack))))

(defn set-result-stack
  "result - `net.minecraft.item.ItemStack`"
  ([^LivingEntityUseItemEvent$Finish this ^net.minecraft.item.ItemStack result]
    (-> this (.setResultStack result))))

